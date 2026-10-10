package kotlinx.coroutines.rx2;

import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: RxAwait.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m90084d2 = {"Lkotlinx/coroutines/rx2/Mode;", "", CmcdData.Factory.STREAMING_FORMAT_SS, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getS", "()Ljava/lang/String;", "FIRST", "FIRST_OR_DEFAULT", "LAST", "SINGLE", "toString", "kotlinx-coroutines-rx2"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
enum Mode {
    FIRST("awaitFirst"),
    FIRST_OR_DEFAULT("awaitFirstOrDefault"),
    LAST("awaitLast"),
    SINGLE("awaitSingle");


    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumEntries f91777c = EnumEntriesKt.enumEntries(m91203a());

    @NotNull
    private final String s;

    @NotNull
    public static EnumEntries<Mode> getEntries() {
        return f91777c;
    }

    @NotNull
    public final String getS() {
        return this.s;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.s;
    }

    Mode(String str) {
        this.s = str;
    }
}
