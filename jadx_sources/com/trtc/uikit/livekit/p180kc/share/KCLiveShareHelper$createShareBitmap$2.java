package com.trtc.uikit.livekit.p180kc.share;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.ViewKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import com.trtc.uikit.livekit.p180kc.data.entity.LiveShareLink;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCLiveShareHelper.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.share.KCLiveShareHelper$createShareBitmap$2", m90122f = "KCLiveShareHelper.kt", m90123i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, m90124l = {93, 94}, m90125m = "invokeSuspend", m90126n = {"$this$withContext", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "ivAvatar", "tvNickname", "tvSubtitle", "ivCover", "avatarBitmapDeferred", "coverBitmapDeferred", "$this$withContext", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "ivAvatar", "tvNickname", "tvSubtitle", "ivCover", "avatarBitmapDeferred", "coverBitmapDeferred", "avatarBitmap"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
@SourceDebugExtension({"SMAP\nKCLiveShareHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCLiveShareHelper.kt\ncom/trtc/uikit/livekit/kc/share/KCLiveShareHelper$createShareBitmap$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
public final class KCLiveShareHelper$createShareBitmap$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Bitmap>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ LiveShareLink $share;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCLiveShareHelper$createShareBitmap$2(Context context, LiveShareLink liveShareLink, Continuation<? super KCLiveShareHelper$createShareBitmap$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$share = liveShareLink;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KCLiveShareHelper$createShareBitmap$2 kCLiveShareHelper$createShareBitmap$2 = new KCLiveShareHelper$createShareBitmap$2(this.$context, this.$share, continuation);
        kCLiveShareHelper$createShareBitmap$2.L$0 = obj;
        return kCLiveShareHelper$createShareBitmap$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Bitmap> continuation) {
        return ((KCLiveShareHelper$createShareBitmap$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x014b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0150  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TextView textView;
        ImageView imageView;
        InterfaceC41729r0 interfaceC41729r0M91102b;
        Object objMo91198h;
        InterfaceC41729r0 interfaceC41729r0;
        View view;
        ImageView imageView2;
        TextView textView2;
        Object objMo91198h2;
        Bitmap bitmap;
        ImageView imageView3;
        Bitmap bitmap2;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            View viewInflate = LayoutInflater.from(this.$context).inflate(R$layout.live_kc_share_view, (ViewGroup) null, false);
            ImageView imageView4 = (ImageView) viewInflate.findViewById(R$id.ivAvatar);
            TextView textView3 = (TextView) viewInflate.findViewById(R$id.tvNickname);
            textView = (TextView) viewInflate.findViewById(R$id.tvSubtitle);
            ImageView imageView5 = (ImageView) viewInflate.findViewById(R$id.ivCover);
            String nickname = this.$share.getNickname();
            if (nickname == null) {
                nickname = "";
            }
            textView3.setText(nickname);
            String roomTitle = this.$share.getRoomTitle();
            textView.setText(roomTitle != null ? roomTitle : "");
            imageView = imageView5;
            InterfaceC41729r0 interfaceC41729r0M91102b2 = C41696j.m91102b(interfaceC41709m0, null, null, new KCLiveShareHelper$createShareBitmap$2$avatarBitmapDeferred$1(this.$context, this.$share, null), 3, null);
            interfaceC41729r0M91102b = C41696j.m91102b(interfaceC41709m0, null, null, new KCLiveShareHelper$createShareBitmap$2$coverBitmapDeferred$1(this.$context, this.$share, null), 3, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.L$1 = viewInflate;
            this.L$2 = imageView4;
            this.L$3 = SpillingKt.nullOutSpilledVariable(textView3);
            this.L$4 = SpillingKt.nullOutSpilledVariable(textView);
            this.L$5 = imageView;
            this.L$6 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b2);
            this.L$7 = interfaceC41729r0M91102b;
            this.label = 1;
            objMo91198h = interfaceC41729r0M91102b2.mo91198h(this);
            if (objMo91198h != coroutine_suspended) {
                interfaceC41729r0 = interfaceC41729r0M91102b2;
                view = viewInflate;
                imageView2 = imageView4;
                textView2 = textView3;
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            interfaceC41729r0M91102b = (InterfaceC41729r0) this.L$7;
            InterfaceC41729r0 interfaceC41729r1 = (InterfaceC41729r0) this.L$6;
            ImageView imageView6 = (ImageView) this.L$5;
            TextView textView4 = (TextView) this.L$4;
            textView2 = (TextView) this.L$3;
            imageView2 = (ImageView) this.L$2;
            View view2 = (View) this.L$1;
            ResultKt.throwOnFailure(obj);
            imageView = imageView6;
            textView = textView4;
            objMo91198h = obj;
            interfaceC41729r0 = interfaceC41729r1;
            view = view2;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bitmap = (Bitmap) this.L$8;
            ImageView imageView7 = (ImageView) this.L$5;
            imageView3 = (ImageView) this.L$2;
            view = (View) this.L$1;
            ResultKt.throwOnFailure(obj);
            imageView = imageView7;
            objMo91198h2 = obj;
        }
        bitmap2 = (Bitmap) objMo91198h2;
        if (bitmap != null) {
            imageView3.setImageBitmap(bitmap);
        }
        if (bitmap2 != null) {
            imageView.setImageBitmap(bitmap2);
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(this.$context.getResources().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        Intrinsics.checkNotNull(view);
        return ViewKt.drawToBitmap$default(view, null, 1, null);
        Bitmap bitmap3 = (Bitmap) objMo91198h;
        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
        this.L$1 = view;
        this.L$2 = imageView2;
        this.L$3 = SpillingKt.nullOutSpilledVariable(textView2);
        this.L$4 = SpillingKt.nullOutSpilledVariable(textView);
        this.L$5 = imageView;
        this.L$6 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
        this.L$7 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
        this.L$8 = bitmap3;
        this.label = 2;
        objMo91198h2 = interfaceC41729r0M91102b.mo91198h(this);
        if (objMo91198h2 != coroutine_suspended) {
            bitmap = bitmap3;
            imageView3 = imageView2;
            bitmap2 = (Bitmap) objMo91198h2;
            if (bitmap != null) {
                imageView3.setImageBitmap(bitmap);
            }
            if (bitmap2 != null) {
                imageView.setImageBitmap(bitmap2);
            }
            view.measure(View.MeasureSpec.makeMeasureSpec(this.$context.getResources().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            Intrinsics.checkNotNull(view);
            return ViewKt.drawToBitmap$default(view, null, 1, null);
        }
        return coroutine_suspended;
    }
}
