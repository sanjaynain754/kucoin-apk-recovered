package p794yd;

import f00.C37304a;
import g00.InterfaceC37756h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p757xd.InterfaceC46139a;
import p757xd.InterfaceC46150l;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yd.a */
/* JADX INFO: compiled from: MarginISymbolBarUIClickListener.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001BV\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0015\u001a\u00020\bH\u0016J\b\u0010\u0016\u001a\u00020\bH\u0016J\u0012\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0019\u001a\u00020\bH\u0016J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\b0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/core/biz/symbolbar/margin/MarginISymbolBarUIClickListener;", "Lcom/kubi/core/biz/symbolbar/ISymbolBarUIClickListener;", "trackPageId", "", "isIsolated", "", "moreClickListener", "Lkotlin/Function0;", "", "symbolMenuClickListener", "kLineStatusClickListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isShow", "<init>", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "symbolBarType", "Lcom/kubi/core/biz/symbolbar/SymbolBarType;", "getSymbolBarType", "()Lcom/kubi/core/biz/symbolbar/SymbolBarType;", "showSwitchSymbolDialog", "onLeverIconClick", "jumpToKLineDetail", "symbol", "showMoreDialog", "changeKLinePanel", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46466a implements InterfaceC46139a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f104213a;

    /* JADX INFO: renamed from: b */
    public final boolean f104214b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Function0<Unit> f104215c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Function0<Unit> f104216d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Function1<Boolean, Unit> f104217e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final InterfaceC46150l f104218f;

    /* JADX WARN: Multi-variable type inference failed */
    public C46466a(@NotNull String trackPageId, boolean z11, @NotNull Function0<Unit> moreClickListener, @NotNull Function0<Unit> symbolMenuClickListener, @NotNull Function1<? super Boolean, Unit> kLineStatusClickListener) {
        Intrinsics.checkNotNullParameter(trackPageId, "trackPageId");
        Intrinsics.checkNotNullParameter(moreClickListener, "moreClickListener");
        Intrinsics.checkNotNullParameter(symbolMenuClickListener, "symbolMenuClickListener");
        Intrinsics.checkNotNullParameter(kLineStatusClickListener, "kLineStatusClickListener");
        this.f104213a = trackPageId;
        this.f104214b = z11;
        this.f104215c = moreClickListener;
        this.f104216d = symbolMenuClickListener;
        this.f104217e = kLineStatusClickListener;
        this.f104218f = z11 ? InterfaceC46150l.b.f103655a : InterfaceC46150l.a.f103654a;
    }

    @Override // p757xd.InterfaceC46139a
    /* JADX INFO: renamed from: a */
    public void mo101693a() {
        this.f104216d.invoke();
    }

    @Override // p757xd.InterfaceC46139a
    /* JADX INFO: renamed from: c */
    public void mo101695c(boolean z11) {
        this.f104217e.invoke(Boolean.valueOf(z11));
    }

    @Override // p757xd.InterfaceC46139a
    /* JADX INFO: renamed from: d */
    public void mo101696d() {
        this.f104215c.invoke();
    }

    @Override // p757xd.InterfaceC46139a
    /* JADX INFO: renamed from: e */
    public void mo101697e(@Nullable String str) {
        C43852m.m96591c(this.f104213a, "informationStrip", "3", null, 8, null);
        InterfaceC37756h.a.m85145c(C37304a.f82764a, this.f104214b ? "isolated" : "cross", str, null, C43852m.m96601m(this.f104213a, "informationStrip", "3"), null, null, 52, null);
    }

    @Override // p757xd.InterfaceC46139a
    /* JADX INFO: renamed from: b */
    public void mo101694b() {
    }
}
