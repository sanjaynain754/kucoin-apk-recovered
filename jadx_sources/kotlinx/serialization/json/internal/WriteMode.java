package kotlinx.serialization.json.internal;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.JvmField;

/* JADX INFO: compiled from: WriteMode.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\f\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m90084d2 = {"Lkotlinx/serialization/json/internal/WriteMode;", "", "begin", "", "end", "<init>", "(Ljava/lang/String;ICC)V", "OBJ", "LIST", "MAP", "POLY_OBJ", "kotlinx-serialization-json"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public enum WriteMode {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f92083c = EnumEntriesKt.enumEntries(m91809a());

    @JvmField
    public final char begin;

    @JvmField
    public final char end;

    @NotNull
    public static EnumEntries<WriteMode> getEntries() {
        return f92083c;
    }

    WriteMode(char c11, char c12) {
        this.begin = c11;
        this.end = c12;
    }
}
