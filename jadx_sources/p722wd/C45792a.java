package p722wd;

import be.InterfaceC4578a;
import com.kubi.p110rn.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: wd.a */
/* JADX INFO: compiled from: ShareEvent.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/core/biz/sharevm/BizSupportChangeEvent;", "Lcom/kubi/core/biz/sharevm/IShareCoreBizEvent;", Constants.BIZ, "Lcom/kubi/core/config/TradeBiz;", "symbol", "", "isVisible", "", "<init>", "(Lcom/kubi/core/config/TradeBiz;Ljava/lang/String;Z)V", "getBiz", "()Lcom/kubi/core/config/TradeBiz;", "getSymbol", "()Ljava/lang/String;", "()Z", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45792a implements InterfaceC45793b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final InterfaceC4578a f103212a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f103213b;

    /* JADX INFO: renamed from: c */
    public final boolean f103214c;

    public C45792a(@NotNull InterfaceC4578a biz, @Nullable String str, boolean z11) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        this.f103212a = biz;
        this.f103213b = str;
        this.f103214c = z11;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC4578a getF103212a() {
        return this.f103212a;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF103213b() {
        return this.f103213b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getF103214c() {
        return this.f103214c;
    }
}
