package com.boevedev.pomodoro.model;

public final class Attempt {
    private String mMessage;
    private int mRemainingSeconds;
    private AttemptKind mKind;

    public Attempt(AttemptKind kind, String message) {
        this.mMessage = message;
        this.mKind = kind;
        this.mRemainingSeconds = kind.getmTotalSeconds();
    }

    @Override
    public String toString() {
        return "Attempt{" +
                "mMessage='" + mMessage + '\'' +
                ", mRemainingSeconds=" + mRemainingSeconds +
                ", mKind=" + mKind +
                '}';
    }

    public String getMessage() {
        return this.mMessage;
    }

    public int getRemainingSeconds() {
        return this.mRemainingSeconds;
    }

    public AttemptKind getKind() {
        return this.mKind;
    }

    public void setMessage(String mMessage) {
        this.mMessage = mMessage;
    }

    public void tick() {
        mRemainingSeconds--;
    }

    public void save() {
        System.out.printf("Saving: %s %n", this);
    }
}
