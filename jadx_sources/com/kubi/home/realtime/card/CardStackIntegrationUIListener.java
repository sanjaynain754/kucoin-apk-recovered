package com.kubi.home.realtime.card;

import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.realtime.IRealTimeData;
import com.kubi.home.realtime.frame.view.CardStackView;
import com.kubi.utils.extensions.C27023a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p456mj.C42562k;
import p456mj.InterfaceC42553b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.home.realtime.card.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: CardStackIntegrationUIListener.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0006J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0006\u0010\u0015\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/home/realtime/card/CardStackIntegrationUIListener;", "Lcom/kubi/home/realtime/frame/manager/IUIDataRefreshListener;", "cardStackView", "Lcom/kubi/home/realtime/frame/view/CardStackView;", "onUIOperationsCompleted", "Lkotlin/Function0;", "", "<init>", "(Lcom/kubi/home/realtime/frame/view/CardStackView;Lkotlin/jvm/functions/Function0;)V", "refreshHelper", "Lcom/kubi/home/realtime/card/CardStackViewRefreshHelper;", "bindToUI", "onDestroy", "onAdd", "data", "Lcom/kubi/home/realtime/IRealTimeData;", "immediate", "", "onUpdate", "onRemove", "onRemoveAll", "forceRefresh", "cleanup", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CardStackIntegrationUIListener implements InterfaceC42553b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final CardStackView f26097a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final Function0<Unit> f26098b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final CardStackViewRefreshHelper f26099c;

    public CardStackIntegrationUIListener(@NotNull CardStackView cardStackView, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(cardStackView, "cardStackView");
        this.f26097a = cardStackView;
        this.f26098b = function0;
        this.f26099c = new CardStackViewRefreshHelper(cardStackView, function0);
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m30091g(IRealTimeData data) throws JSONException {
        Intrinsics.checkNotNullParameter(data, "data");
        C42562k.f94240a.m93305D(data, true);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", data.getViewType().getTypeName());
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "deleteActivity", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    @Override // p456mj.InterfaceC42553b
    /* JADX INFO: renamed from: a */
    public void mo30086a(@NotNull IRealTimeData data, boolean z11) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f26099c.m30150j(data, z11);
    }

    @Override // p456mj.InterfaceC42553b
    /* JADX INFO: renamed from: b */
    public void mo30087b(boolean z11) {
        this.f26099c.m30147f(z11);
    }

    @Override // p456mj.InterfaceC42553b
    /* JADX INFO: renamed from: c */
    public void mo30088c(@NotNull IRealTimeData data, boolean z11) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f26099c.m30144b(data, z11);
    }

    @Override // p456mj.InterfaceC42553b
    /* JADX INFO: renamed from: d */
    public void mo30089d(@NotNull IRealTimeData data, boolean z11) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f26099c.m30148g(data, z11);
    }

    /* JADX INFO: renamed from: f */
    public final void m30092f() {
        C42562k.f94240a.m93314m(this);
        this.f26097a.setOnCardSwipedListener(new Function1() { // from class: com.kubi.home.realtime.card.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardStackIntegrationUIListener.m30091g((IRealTimeData) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m30093h() {
        C42562k.f94240a.m93308H(this);
    }
}
