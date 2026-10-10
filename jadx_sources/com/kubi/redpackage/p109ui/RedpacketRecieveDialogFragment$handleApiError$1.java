package com.kubi.redpackage.p109ui;

import android.widget.TextView;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.redpackage.R$string;
import com.kubi.redpackage.RedPackageApi;
import com.kubi.redpackage.entity.RedpacketInfoEntity;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.tencent.thumbplayer.tcmedia.core.player.ITPNativePlayerMessageCallback;
import gf.C37885i;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: RedpacketRecieveDialogFragment.kt */
/* JADX INFO: loaded from: classes38.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.redpackage.ui.RedpacketRecieveDialogFragment$handleApiError$1", m90122f = "RedpacketRecieveDialogFragment.kt", m90123i = {}, m90124l = {ITPNativePlayerMessageCallback.INFO_LONG1_DRM_FATAL_ERROR}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nRedpacketRecieveDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedpacketRecieveDialogFragment.kt\ncom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$handleApiError$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,320:1\n25#2:321\n26#2:323\n1#3:322\n*S KotlinDebug\n*F\n+ 1 RedpacketRecieveDialogFragment.kt\ncom/kubi/redpackage/ui/RedpacketRecieveDialogFragment$handleApiError$1\n*L\n275#1:321\n275#1:323\n275#1:322\n*E\n"})
public final class RedpacketRecieveDialogFragment$handleApiError$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ TextView $tvOpen;
    final /* synthetic */ TextView $tvTips;
    int label;
    final /* synthetic */ RedpacketRecieveDialogFragment this$0;

    /* JADX INFO: renamed from: com.kubi.redpackage.ui.RedpacketRecieveDialogFragment$handleApiError$1$1 */
    /* JADX INFO: compiled from: RedpacketRecieveDialogFragment.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/redpackage/entity/RedpacketInfoEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.redpackage.ui.RedpacketRecieveDialogFragment$handleApiError$1$1", m90122f = "RedpacketRecieveDialogFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C227361 extends SuspendLambda implements Function2<RedpacketInfoEntity, Continuation<? super Unit>, Object> {
        final /* synthetic */ TextView $tvOpen;
        final /* synthetic */ TextView $tvTips;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ RedpacketRecieveDialogFragment this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(RedpacketInfoEntity redpacketInfoEntity, Continuation<? super Unit> continuation) {
            return ((C227361) create(redpacketInfoEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C227361(TextView textView, TextView textView2, RedpacketRecieveDialogFragment redpacketRecieveDialogFragment, Continuation<? super C227361> continuation) {
            super(2, continuation);
            this.$tvOpen = textView;
            this.$tvTips = textView2;
            this.this$0 = redpacketRecieveDialogFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C227361 c227361 = new C227361(this.$tvOpen, this.$tvTips, this.this$0, continuation);
            c227361.L$0 = obj;
            return c227361;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            RedpacketInfoEntity redpacketInfoEntity = (RedpacketInfoEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Integer welfareStatus = redpacketInfoEntity.getWelfareStatus();
            if (welfareStatus != null && welfareStatus.intValue() == 3) {
                C27046k.m66703r(this.$tvOpen);
                this.$tvTips.setText(R$string.redpacket_expired);
            } else if (C27025c.m66566d(redpacketInfoEntity.getReceive())) {
                C27046k.m66703r(this.$tvOpen);
                TextView textView = this.$tvTips;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.this$0.getString(R$string.received));
                sb2.append('\n');
                BigDecimal receiveAmount = redpacketInfoEntity.getReceiveAmount();
                sb2.append(receiveAmount != null ? C37885i.m85570i(receiveAmount, redpacketInfoEntity.getCurrency(), (254 & 2) != 0 ? RoundingMode.DOWN : null, (254 & 4) != 0 ? 8 : 0, (254 & 8) != 0 ? false : false, (254 & 16) != 0 ? false : false, (254 & 32) == 0 ? false : false, (254 & 64) != 0, (254 & 128) != 0 ? "0.00" : null) : null);
                sb2.append(' ');
                sb2.append(redpacketInfoEntity.getCurrency());
                textView.setText(sb2.toString());
            }
            Integer receiveStatus = redpacketInfoEntity.getReceiveStatus();
            if (receiveStatus != null && receiveStatus.intValue() == 12) {
                C27046k.m66703r(this.$tvOpen);
                this.$tvTips.setText(this.this$0.getString(R$string.redpacket_return));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RedpacketRecieveDialogFragment$handleApiError$1(RedpacketRecieveDialogFragment redpacketRecieveDialogFragment, TextView textView, TextView textView2, Continuation<? super RedpacketRecieveDialogFragment$handleApiError$1> continuation) {
        super(2, continuation);
        this.this$0 = redpacketRecieveDialogFragment;
        this.$tvOpen = textView;
        this.$tvTips = textView2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RedpacketRecieveDialogFragment$handleApiError$1(this.this$0, this.$tvOpen, this.$tvTips, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((RedpacketRecieveDialogFragment$handleApiError$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            RedPackageApi redPackageApiM54087z4 = this.this$0.m54087z4();
            String str = this.this$0.f43198r0;
            if (str == null) {
                str = "";
            }
            InterfaceC41634e<RedpacketInfoEntity> interfaceC41634eM53735j = redPackageApiM54087z4.m53735j(str);
            C227361 c227361 = new C227361(this.$tvOpen, this.$tvTips, this.this$0, null);
            this.label = 1;
            obj = RetrofitFlowExKt.m42824e(interfaceC41634eM53735j, false, c227361, this, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Throwable throwable = ((C19334f) obj).getThrowable();
        if (throwable != null) {
            C44128b.m97263g("RedpacketRecieveDialogFragment", throwable);
        }
        return Unit.INSTANCE;
    }
}
