package com.facebook.soloader.recovery;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.facebook.soloader.LogUtil;
import com.facebook.soloader.SoLoader;
import java.io.File;

/* JADX INFO: loaded from: classes45.dex */
public class BaseApkPathHistory {
    private int mCounter;
    private final String[] mPaths;

    public synchronized boolean recordPathIfNew(String str) {
        for (String str2 : this.mPaths) {
            if (str.equals(str2)) {
                return false;
            }
        }
        StringBuilder sb2 = new StringBuilder("Recording new base apk path: ");
        sb2.append(str);
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        report(sb2);
        LogUtil.m10658w(SoLoader.TAG, sb2.toString());
        String[] strArr = this.mPaths;
        int i11 = this.mCounter;
        strArr[i11 % strArr.length] = str;
        this.mCounter = i11 + 1;
        return true;
    }

    public synchronized void report(StringBuilder sb2) {
        try {
            sb2.append("Previously recorded ");
            sb2.append(this.mCounter);
            sb2.append(" base apk paths.");
            if (this.mCounter > 0) {
                sb2.append(" Most recent ones:");
            }
            int i11 = 0;
            while (true) {
                String[] strArr = this.mPaths;
                if (i11 < strArr.length) {
                    int i12 = (this.mCounter - i11) - 1;
                    if (i12 >= 0) {
                        String str = strArr[i12 % strArr.length];
                        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                        sb2.append(str);
                        sb2.append(" (");
                        sb2.append(new File(str).exists() ? "exists" : "does not exist");
                        sb2.append(")");
                    }
                    i11++;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized int size() {
        return this.mCounter;
    }

    public BaseApkPathHistory(int i11) {
        if (i11 > 0) {
            this.mPaths = new String[i11];
            this.mCounter = 0;
            return;
        }
        throw new IllegalArgumentException();
    }

    public String report() {
        StringBuilder sb2 = new StringBuilder();
        report(sb2);
        return sb2.toString();
    }
}
