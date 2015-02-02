package com.projectEuler;

import org.junit.runners.model.InitializationError;

/**
 * Created by michael on 2/1/15.
 */
public abstract class peSolution {
    private String name;
    private String[] data;
    private long startTime = 0;
    private long endTime = 0;
    private long elapsedTime = 0;

    public static final String TEST_RESULT_FORMAT = "%s test result:     %15s  run time is: %4sms";
    public static final String SOLUTION_RESULT_FORMAT = "%s solution result: %15s  run time is: %4sms";

    protected final String baseData;
    protected final String testData;

    protected peSolution(String name, String baseData, String testData) {
        this.name = name;
        this.baseData = baseData;
        this.testData = testData;
    }

    public final String solution() throws InitializationError {
        return solution(baseData, SOLUTION_RESULT_FORMAT);
    }

    public abstract String solution(String data, String format) throws InitializationError;

    public final String test() throws InitializationError {
        return solution(testData, TEST_RESULT_FORMAT);
    }

    protected int getArgInt(int n) throws InitializationError {
        checkData();
        return Integer.parseInt(data[n - 1]);
    }

    protected long getArgLong(int n) throws InitializationError {
        checkData();
        return Long.parseLong(data[n - 1]);
    }

    protected String getArgString(int n) throws InitializationError {
        checkData();
        return data[n - 1];
    }

    public void setData(String data) {
        this.data = data.split(",");
    }

    private void checkData() throws InitializationError {
        if (data == null) {
            throw new InitializationError("setData must be called before getArg...");
        }
    }

    protected void startTimer() {
        startTime = System.nanoTime();
        elapsedTime = startTime;
    }

    protected void stopTimer() {
        endTime = System.nanoTime();
    }

    public double getRunTime() {
        return (endTime - startTime) / 1e6;
    }

    public long getElapsedTime() {
        long elapsedOld = elapsedTime;
        elapsedTime = System.nanoTime();
        return elapsedTime - elapsedOld;
    }

    protected void resetTimer() {
        startTime = 0;
        endTime = 0;
        elapsedTime = 0;
    }

    protected String getResult(String format, String result) {
        return String.format(format, name, result, Double.toString(getRunTime()));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
}
