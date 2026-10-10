package com.kubi.tradingbotkit.business.beginnerGuide.viewModel;

import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.tradingbotkit.business.spot.viewmodel.t0;
import com.kubi.tradingbotkit.entity.gudiGuide.PictureEntity;
import com.kubi.utils.C27099x;
import com.kubi.utils.DataMapUtil;
import com.kubi.utils.extensions.C27041f;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41709m0;
import n50.C42756a;
import p481ny.C42899b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: GuideStepViewModel.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.tradingbotkit.business.beginnerGuide.viewModel.GuideStepViewModel$getGuidePicture$1", m90122f = "GuideStepViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nGuideStepViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuideStepViewModel.kt\ncom/kubi/tradingbotkit/business/beginnerGuide/viewModel/GuideStepViewModel$getGuidePicture$1\n+ 2 TradingBotIssue.kt\ncom/kubi/tradingbotkit/exeption/TradingBotIssueKt\n*L\n1#1,44:1\n45#2,4:45\n*S KotlinDebug\n*F\n+ 1 GuideStepViewModel.kt\ncom/kubi/tradingbotkit/business/beginnerGuide/viewModel/GuideStepViewModel$getGuidePicture$1\n*L\n36#1:45,4\n*E\n"})
public final class GuideStepViewModel$getGuidePicture$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ GuideStepViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.beginnerGuide.viewModel.GuideStepViewModel$getGuidePicture$1$a */
    /* JADX INFO: compiled from: GuideStepViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001¨\u0006\u0005"}, m90084d2 = {"com/kubi/tradingbotkit/business/beginnerGuide/viewModel/GuideStepViewModel$getGuidePicture$1$map$1", "Lcom/google/gson/reflect/TypeToken;", "", "", "Lcom/kubi/tradingbotkit/entity/gudiGuide/PictureEntity;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26097a extends TypeToken<Map<String, ? extends PictureEntity>> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuideStepViewModel$getGuidePicture$1(GuideStepViewModel guideStepViewModel, Continuation<? super GuideStepViewModel$getGuidePicture$1> continuation) {
        super(2, continuation);
        this.this$0 = guideStepViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GuideStepViewModel$getGuidePicture$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((GuideStepViewModel$getGuidePicture$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            DataMapUtil dataMapUtil = DataMapUtil.f54245a;
            Map map = null;
            String strM66369j = DataMapUtil.m66369j(dataMapUtil, "gird_guide_picture", null, 2, null);
            if (strM66369j.length() == 0 || Intrinsics.areEqual(strM66369j, "{}")) {
                strM66369j = C27041f.m66669i(RemoteConfig.m20458b("kc_trade_bot_guideline"), "{}");
                dataMapUtil.m66380o("gird_guide_picture", strM66369j);
            }
            try {
                map = (Map) C27099x.m66914d(strM66369j, new C26097a().getType());
            } catch (Exception e11) {
                String simpleName = GuideStepViewModel.class.getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                if (!C42899b.m94075e(e11)) {
                    C42756a.m93685b(e11, simpleName);
                }
            }
            if (map != null) {
                t0.d(this.this$0.m63854p(), MapsKt.toMutableMap(map));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
