package p828zd;

import f00.C37304a;
import g00.InterfaceC37762n;
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

/* JADX INFO: renamed from: zd.a */
/* JADX INFO: compiled from: SpotSymbolBarClickListener.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\\\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\u0012\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0019\u001a\u00020\u0006H\u0016J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00060\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/core/biz/symbolbar/spot/SpotSymbolBarClickListener;", "Lcom/kubi/core/biz/symbolbar/ISymbolBarUIClickListener;", "pageId", "", "symbolMenuClickListener", "Lkotlin/Function0;", "", "leverClickListener", "moreClickListener", "kLineStatusClickListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isShow", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "symbolBarType", "Lcom/kubi/core/biz/symbolbar/SymbolBarType$Spot;", "getSymbolBarType", "()Lcom/kubi/core/biz/symbolbar/SymbolBarType$Spot;", "showSwitchSymbolDialog", "onLeverIconClick", "jumpToKLineDetail", "symbol", "showMoreDialog", "changeKLinePanel", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46760a implements InterfaceC46139a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f104619a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Function0<Unit> f104620b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Function0<Unit> f104621c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Function0<Unit> f104622d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Function1<Boolean, Unit> f104623e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final InterfaceC46150l.c f104624f;

    /* JADX WARN: Multi-variable type inference failed */
    public C46760a(@NotNull String pageId, @NotNull Function0<Unit> symbolMenuClickListener, @NotNull Function0<Unit> leverClickListener, @NotNull Function0<Unit> moreClickListener, @NotNull Function1<? super Boolean, Unit> kLineStatusClickListener) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(symbolMenuClickListener, "symbolMenuClickListener");
        Intrinsics.checkNotNullParameter(leverClickListener, "leverClickListener");
        Intrinsics.checkNotNullParameter(moreClickListener, "moreClickListener");
        Intrinsics.checkNotNullParameter(kLineStatusClickListener, "kLineStatusClickListener");
        this.f104619a = pageId;
        this.f104620b = symbolMenuClickListener;
        this.f104621c = leverClickListener;
        this.f104622d = moreClickListener;
        this.f104623e = kLineStatusClickListener;
        this.f104624f = InterfaceC46150l.c.f103656a;
    }

    @Override // p757xd.InterfaceC46139a
    /* JADX INFO: renamed from: a */
    public void mo101693a() {
        this.f104620b.invoke();
    }

    @Override // p757xd.InterfaceC46139a
    /* JADX INFO: renamed from: b */
    public void mo101694b() {
        this.f104621c.invoke();
    }

    @Override // p757xd.InterfaceC46139a
    /* JADX INFO: renamed from: c */
    public void mo101695c(boolean z11) {
        this.f104623e.invoke(Boolean.valueOf(z11));
    }

    @Override // p757xd.InterfaceC46139a
    /* JADX INFO: renamed from: d */
    public void mo101696d() {
        this.f104622d.invoke();
    }

    @Override // p757xd.InterfaceC46139a
    /* JADX INFO: renamed from: e */
    public void mo101697e(@Nullable String str) {
        C43852m.m96591c(this.f104619a, "kButton", "1", null, 8, null);
        InterfaceC37762n.a.m85177a(C37304a.f82764a, str, C43852m.m96601m(this.f104619a, "kButton", "1"), null, null, 12, null);
    }
}
