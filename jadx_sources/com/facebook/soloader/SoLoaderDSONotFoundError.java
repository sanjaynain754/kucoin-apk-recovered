package com.facebook.soloader;

import android.content.Context;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;

/* JADX INFO: loaded from: classes45.dex */
@DoNotStripAny
public class SoLoaderDSONotFoundError extends SoLoaderULError {
    public SoLoaderDSONotFoundError(String str) {
        super(str);
    }

    public SoLoaderDSONotFoundError(String str, String str2) {
        super(str, str2);
    }

    public static SoLoaderDSONotFoundError create(String str, Context context, SoSource[] soSourceArr) {
        StringBuilder sb2 = new StringBuilder("couldn't find DSO to load: ");
        sb2.append(str);
        sb2.append("\n\texisting SO sources: ");
        for (int i11 = 0; i11 < soSourceArr.length; i11++) {
            sb2.append("\n\t\tSoSource ");
            sb2.append(i11);
            sb2.append(": ");
            sb2.append(soSourceArr[i11].toString());
        }
        if (context != null) {
            sb2.append("\n\tNative lib dir: ");
            sb2.append(context.getApplicationInfo().nativeLibraryDir);
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        }
        return new SoLoaderDSONotFoundError(str, sb2.toString());
    }
}
