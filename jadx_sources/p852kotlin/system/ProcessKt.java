package p852kotlin.system;

import p852kotlin.Metadata;
import p852kotlin.internal.InlineOnly;
import p852kotlin.jvm.JvmName;

/* JADX INFO: compiled from: Process.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b¨\u0006\u0004"}, m90084d2 = {"exitProcess", "", "status", "", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@JvmName(name = "ProcessKt")
public final class ProcessKt {
    @InlineOnly
    private static final Void exitProcess(int i11) {
        System.exit(i11);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
