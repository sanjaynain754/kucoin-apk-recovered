package com.kubi.widget.web.file;

import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.widget.web.file.i */
/* JADX INFO: compiled from: FileBridgeCoordinator.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0002¨\u0006\u0004"}, m90084d2 = {"errorCodeOr", "", "", "default", "LWebWidget_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C27148i {
    /* JADX INFO: renamed from: b */
    public static final String m67198b(Throwable th2, String str) {
        String errorCode;
        FileBridgeException fileBridgeException = th2 instanceof FileBridgeException ? (FileBridgeException) th2 : null;
        return (fileBridgeException == null || (errorCode = fileBridgeException.getErrorCode()) == null) ? str : errorCode;
    }
}
