package com.boevedev.pomodoro.model;

public enum AttemptKind {
    FOCUS(5, "Focus time"),
    BREAK(5 * 60, "Break time");

    private int mTotalSeconds;
    private String mDisplayName;

    AttemptKind(int totalSeconds, String displayName) {
        mTotalSeconds = totalSeconds;
        mDisplayName = displayName;
    }

    public int getmTotalSeconds() {
        return mTotalSeconds;
    }

    public String getDisplayName() {
        return mDisplayName;
    }
}
