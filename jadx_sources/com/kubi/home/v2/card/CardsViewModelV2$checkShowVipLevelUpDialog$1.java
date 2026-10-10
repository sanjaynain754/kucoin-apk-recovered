package com.kubi.home.v2.card;

import androidx.fragment.app.FragmentActivity;
import com.kubi.sdk.flutter.KCFlutterRouteManager;
import com.kubi.utils.C27099x;
import java.util.Map;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p502oj.C43097b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: CardsViewModelV2.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.v2.card.CardsViewModelV2$checkShowVipLevelUpDialog$1", m90122f = "CardsViewModelV2.kt", m90123i = {}, m90124l = {574}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nCardsViewModelV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardsViewModelV2.kt\ncom/kubi/home/v2/card/CardsViewModelV2$checkShowVipLevelUpDialog$1\n+ 2 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n*L\n1#1,651:1\n35#2,3:652\n*S KotlinDebug\n*F\n+ 1 CardsViewModelV2.kt\ncom/kubi/home/v2/card/CardsViewModelV2$checkShowVipLevelUpDialog$1\n*L\n581#1:652,3\n*E\n"})
public final class CardsViewModelV2$checkShowVipLevelUpDialog$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    int label;
    final /* synthetic */ CardsViewModelV2 this$0;

    /* JADX INFO: renamed from: f */
    public static final Unit m30778f(CardsViewModelV2 cardsViewModelV2, FragmentActivity fragmentActivity, Map map) {
        cardsViewModelV2.f26483i0 = false;
        C44128b.m97266j("CardsViewModelV2", "[checkShowVipLevelUpDialog] dialog result:" + map);
        C43097b c43097b = C43097b.f95298a;
        c43097b.m94701d(fragmentActivity);
        c43097b.m94702e(fragmentActivity);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsViewModelV2$checkShowVipLevelUpDialog$1(FragmentActivity fragmentActivity, CardsViewModelV2 cardsViewModelV2, Continuation<? super CardsViewModelV2$checkShowVipLevelUpDialog$1> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
        this.this$0 = cardsViewModelV2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CardsViewModelV2$checkShowVipLevelUpDialog$1(this.$activity, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CardsViewModelV2$checkShowVipLevelUpDialog$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
                CardsViewModelV2$checkShowVipLevelUpDialog$1$info$1 cardsViewModelV2$checkShowVipLevelUpDialog$1$info$1 = new CardsViewModelV2$checkShowVipLevelUpDialog$1$info$1(null);
                this.label = 1;
                obj = C41686h.m91049g(abstractC41697j0M94120b, cardsViewModelV2$checkShowVipLevelUpDialog$1$info$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            VipLevelUpDialogInfo vipLevelUpDialogInfo = (VipLevelUpDialogInfo) obj;
            FragmentActivity fragmentActivity = this.$activity;
            if (fragmentActivity != null && !fragmentActivity.isFinishing() && !this.$activity.isDestroyed() && vipLevelUpDialogInfo != null) {
                Integer num = this.this$0.f26481g0;
                int vipLevel = vipLevelUpDialogInfo.getVipLevel();
                if (num != null && num.intValue() == vipLevel) {
                }
                this.this$0.f26481g0 = Boxing.boxInt(vipLevelUpDialogInfo.getVipLevel());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("home/feed/vipUpgrade?dialogRouteStyle=true&isTransparent=true&jsonData=");
                String strM66919i = C27099x.m66919i(vipLevelUpDialogInfo, false, 2, null);
                if (strM66919i == null) {
                    strM66919i = "";
                }
                sb2.append(strM66919i);
                String string = sb2.toString();
                C43097b c43097b = C43097b.f95298a;
                c43097b.m94699b(this.$activity, 21.0f, 21.0f);
                c43097b.m94698a(this.$activity);
                C44128b.m97266j("CardsViewModelV2", "[checkShowVipLevelUpDialog] openFlutterDialog");
                this.this$0.f26483i0 = true;
                KCFlutterRouteManager kCFlutterRouteManager = KCFlutterRouteManager.f46704a;
                final CardsViewModelV2 cardsViewModelV2 = this.this$0;
                final FragmentActivity fragmentActivity2 = this.$activity;
                kCFlutterRouteManager.m56851l(string, new Function1() { // from class: com.kubi.home.v2.card.k
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CardsViewModelV2$checkShowVipLevelUpDialog$1.m30778f(cardsViewModelV2, fragmentActivity2, (Map) obj2);
                    }
                });
                return Unit.INSTANCE;
            }
            this.this$0.f26482h0 = false;
            Unit unit = Unit.INSTANCE;
            this.this$0.f26482h0 = false;
            return unit;
        } catch (Exception e11) {
            C44128b.m97261e("CardsViewModelV2", "[checkShowVipLevelUpDialog] error:" + e11.getMessage());
        } finally {
            this.this$0.f26482h0 = false;
        }
    }
}
