package com.kubi.redpackage.p109ui;

import android.view.animation.Animation;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.kubi.data.BeepHelper;
import com.kubi.event.api.C12572a;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.redpackage.R$raw;
import com.kubi.redpackage.R$string;
import com.kubi.redpackage.RedPackageApi;
import com.kubi.redpackage.RedPackageHelperKt;
import com.kubi.redpackage.entity.RedpacketInfoEntity;
import com.kubi.redpackage.entity.RedpacketReceiveEntity;
import com.kubi.redpackage.utils.RedPkgCategory;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27041f;
import f00.C37304a;
import g00.InterfaceC37767s;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.json.JSONException;
import p845zv.C46928a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RedpacketRecieveDialogFragment.kt */
/* JADX INFO: loaded from: classes38.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.redpackage.ui.RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1", m90122f = "RedpacketRecieveDialogFragment.kt", m90123i = {}, m90124l = {196}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nRedpacketRecieveDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedpacketRecieveDialogFragment.kt\ncom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,320:1\n25#2:321\n26#2:323\n1#3:322\n*S KotlinDebug\n*F\n+ 1 RedpacketRecieveDialogFragment.kt\ncom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1\n*L\n204#1:321\n204#1:323\n204#1:322\n*E\n"})
public final class RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animation $animation;
    final /* synthetic */ DialogFragmentHelper $helper;
    final /* synthetic */ RedpacketInfoEntity $packetInfo;
    final /* synthetic */ long $startTimeOpen;
    final /* synthetic */ TextView $tvOpen;
    final /* synthetic */ TextView $tvTips;
    int label;
    final /* synthetic */ RedpacketRecieveDialogFragment this$0;

    /* JADX INFO: renamed from: com.kubi.redpackage.ui.RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1$1 */
    /* JADX INFO: compiled from: RedpacketRecieveDialogFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/redpackage/entity/RedpacketReceiveEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.redpackage.ui.RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1$1", m90122f = "RedpacketRecieveDialogFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C227371 extends SuspendLambda implements Function2<RedpacketReceiveEntity, Continuation<? super Unit>, Object> {
        final /* synthetic */ Animation $animation;
        final /* synthetic */ DialogFragmentHelper $helper;
        final /* synthetic */ RedpacketInfoEntity $packetInfo;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(RedpacketReceiveEntity redpacketReceiveEntity, Continuation<? super Unit> continuation) {
            return ((C227371) create(redpacketReceiveEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C227371(Animation animation, RedpacketInfoEntity redpacketInfoEntity, DialogFragmentHelper dialogFragmentHelper, Continuation<? super C227371> continuation) {
            super(2, continuation);
            this.$animation = animation;
            this.$packetInfo = redpacketInfoEntity;
            this.$helper = dialogFragmentHelper;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C227371(this.$animation, this.$packetInfo, this.$helper, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws JSONException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Animation animation = this.$animation;
                if (animation != null) {
                    animation.cancel();
                }
                C12572a.m23695d("com.kubi.redpackage_event:H5Result", RedPackageHelperKt.m53721j(null, 0, null, false, 15, null), 0L, 4, null);
                BeepHelper.m23642f("beep_income", R$raw.asset_in);
                InterfaceC37767s.a.m85193b(C37304a.f82764a, C27041f.m66668h(this.$packetInfo.getSendRecordId()), null, null, null, null, null, null, 126, null);
                this.$helper.dismissAllowingStateLoss();
                C46928a.m103398d(RedPkgCategory.RECEIVE_RESULT, true, null, null, 6, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1(RedpacketRecieveDialogFragment redpacketRecieveDialogFragment, Animation animation, RedpacketInfoEntity redpacketInfoEntity, DialogFragmentHelper dialogFragmentHelper, TextView textView, TextView textView2, long j11, Continuation<? super RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1> continuation) {
        super(2, continuation);
        this.this$0 = redpacketRecieveDialogFragment;
        this.$animation = animation;
        this.$packetInfo = redpacketInfoEntity;
        this.$helper = dialogFragmentHelper;
        this.$tvOpen = textView;
        this.$tvTips = textView2;
        this.$startTimeOpen = j11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1(this.this$0, this.$animation, this.$packetInfo, this.$helper, this.$tvOpen, this.$tvTips, this.$startTimeOpen, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((RedpacketRecieveDialogFragment$onClickOpen$1$onAnimationStart$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        Object objM42823d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            RedPackageApi redPackageApiM54087z4 = this.this$0.m54087z4();
            String strM66668h = C27041f.m66668h(RedPackageHelperKt.m53715d());
            String str = this.this$0.f43198r0;
            if (str == null) {
                str = "";
            }
            InterfaceC41634e<RedpacketReceiveEntity> interfaceC41634eM53734i = redPackageApiM54087z4.m53734i(strM66668h, str);
            C227371 c227371 = new C227371(this.$animation, this.$packetInfo, this.$helper, null);
            this.label = 1;
            objM42823d = RetrofitFlowExKt.m42823d(interfaceC41634eM53734i, false, c227371, this);
            if (objM42823d == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM42823d = obj;
        }
        Animation animation = this.$animation;
        RedpacketRecieveDialogFragment redpacketRecieveDialogFragment = this.this$0;
        RedpacketInfoEntity redpacketInfoEntity = this.$packetInfo;
        DialogFragmentHelper dialogFragmentHelper = this.$helper;
        TextView textView = this.$tvOpen;
        TextView textView2 = this.$tvTips;
        long j11 = this.$startTimeOpen;
        Throwable throwable = ((C19334f) objM42823d).getThrowable();
        if (throwable != null) {
            if (animation != null) {
                animation.cancel();
            }
            C12572a.m23695d("com.kubi.redpackage_event:H5Result", RedPackageHelperKt.m53721j(null, -1, Constants.IPC_BUNDLE_KEY_SEND_ERROR, false, 9, null), 0L, 4, null);
            boolean z11 = throwable instanceof ApiException;
            if (z11) {
                redpacketRecieveDialogFragment.m54082B4((ApiException) throwable, redpacketInfoEntity, dialogFragmentHelper, textView, textView2, j11);
            } else {
                ToastCompat.m66441G(redpacketRecieveDialogFragment.getString(R$string.network_error) + throwable.getMessage(), new Object[0]);
            }
            RedPkgCategory redPkgCategory = RedPkgCategory.RECEIVE_RESULT;
            String strM66669i = C27041f.m66669i(throwable.getMessage(), "--");
            ApiException apiException = z11 ? (ApiException) throwable : null;
            C46928a.m103398d(redPkgCategory, false, strM66669i, C27041f.m66669i(apiException != null ? apiException.code : null, "--"), 1, null);
        }
        return Unit.INSTANCE;
    }
}
