package bi;

import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: bi.a */
/* JADX INFO: compiled from: AirdropActiveSuccessEvent.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m90084d2 = {"Lcom/kubi/futures/event/AirdropActiveSuccessEvent;", "", "valueString", "", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getValueString", "()Ljava/lang/String;", "getCode", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C4609a {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f4136a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f4137b;

    /* JADX WARN: Multi-variable type inference failed */
    public C4609a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public C4609a(@Nullable String str, @Nullable String str2) {
        this.f4136a = str;
        this.f4137b = str2;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF4137b() {
        return this.f4137b;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF4136a() {
        return this.f4136a;
    }

    public /* synthetic */ C4609a(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}
