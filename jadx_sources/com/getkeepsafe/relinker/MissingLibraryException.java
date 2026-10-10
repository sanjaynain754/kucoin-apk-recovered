package com.getkeepsafe.relinker;

import com.tencent.bugly.proguard.C33978va;
import java.util.Arrays;

/* JADX INFO: loaded from: classes45.dex */
public class MissingLibraryException extends RuntimeException {
    public MissingLibraryException(String str, String[] strArr, String[] strArr2) {
        super("Could not find '" + str + "'. Looked for: " + Arrays.toString(strArr) + ", but only found: " + Arrays.toString(strArr2) + C33978va.f72339h);
    }
}
