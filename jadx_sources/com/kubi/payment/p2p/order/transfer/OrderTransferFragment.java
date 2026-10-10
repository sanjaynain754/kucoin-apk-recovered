package com.kubi.payment.p2p.order.transfer;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.blankj.utilcode.util.C5290q;
import com.blankj.utilcode.util.C5302w;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$mipmap;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.AdPayType;
import com.kubi.otc.entity.PayTemplate;
import com.kubi.otc.entity.PayTypeEntity;
import com.kubi.otc.service.OtcDepend;
import com.kubi.payment.flutter.FlutterUtils;
import com.kubi.payment.p2p.base.BaseP2PFragment;
import com.kubi.payment.p2p.data.entities.TransferOrderInfo;
import com.kubi.payment.p2p.order.OrderCountdownOwner;
import com.kubi.payment.p2p.order.OrderDetailFragment;
import com.kubi.payment.p2p.order.OrderProcessDialog;
import com.kubi.payment.p2p.order.PaymentCompleteDialog;
import com.kubi.payment.p2p.widget.P2PViewChatCardEntrance;
import com.kubi.payment.util.PaymentStorageId;
import com.kubi.payment.widget.StepsLayout;
import com.kubi.permissions.utils.PermissionCompatKt;
import com.kubi.resources.C22912t;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.core.Router;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27057k;
import com.kubi.utils.C27096v0;
import com.kubi.utils.C27100x0;
import com.kubi.utils.TimeUtils;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.C27029c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.qcloud.tuicore.TUIConstants;
import eu.C37265w;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026ay.C4400a;
import p270ft.C37693u1;
import p445m2.AbstractC42397h;
import p460n2.InterfaceC42704b;
import p569qq.C43852m;
import p778xy.C46338a;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;
import xb0.C46126b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: OrderTransferFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001/B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0014J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\bH\u0002J\b\u0010\u001d\u001a\u00020\u0016H\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0016J\b\u0010\u001f\u001a\u00020\u0016H\u0002J\u0018\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0002J\b\u0010$\u001a\u00020\u0016H\u0002J\b\u0010%\u001a\u00020\u0016H\u0002J\u0010\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020(H\u0002J\"\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u00142\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020\u0016H\u0002R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u00060"}, m90084d2 = {"Lcom/kubi/payment/p2p/order/transfer/OrderTransferFragment;", "Lcom/kubi/payment/p2p/base/BaseP2PFragment;", "Lcom/kubi/payment/p2p/order/transfer/OrderTransferViewModel;", "Lcom/kubi/payment/p2p/order/OrderCountdownOwner;", "<init>", "()V", "autoCancelOrderTime", "Landroidx/lifecycle/LiveData;", "", "getAutoCancelOrderTime", "()Landroidx/lifecycle/LiveData;", "vb", "Lcom/kubi/otc/databinding/PaymentFragmentP2pOrderTransferBinding;", "getVb", "()Lcom/kubi/otc/databinding/PaymentFragmentP2pOrderTransferBinding;", "vb$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModelClass", "Lkotlin/reflect/KClass;", "getLayout", "", "initViews", "", "onBackPressed", "", "initListener", "observeData", "checkAndShowOrderProcessDialog", "it", "checkAndClearWarnDialogStore", "onResume", "initPayTypeInfo", "showPhoneDialog", "title", "", HintConstants.AUTOFILL_HINT_PHONE, "showQrCode", "saveWireImage", "savePermission", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "backOrderDetail", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOrderTransferFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderTransferFragment.kt\ncom/kubi/payment/p2p/order/transfer/OrderTransferFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,555:1\n147#2,16:556\n1869#3,2:572\n*S KotlinDebug\n*F\n+ 1 OrderTransferFragment.kt\ncom/kubi/payment/p2p/order/transfer/OrderTransferFragment\n*L\n83#1:556,16\n332#1:572,2\n*E\n"})
public final class OrderTransferFragment extends BaseP2PFragment<OrderTransferViewModel> implements OrderCountdownOwner {

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f39887V = C45681e.m100799e(this, new Function1<OrderTransferFragment, C37693u1>() { // from class: com.kubi.payment.p2p.order.transfer.OrderTransferFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37693u1 invoke(@NotNull OrderTransferFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37693u1.m84977a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37693u1, Unit>() { // from class: com.kubi.payment.p2p.order.transfer.OrderTransferFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37693u1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37693u1 c37693u1) {
            invoke(c37693u1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ KProperty<Object>[] f39886X = {Reflection.property1(new PropertyReference1Impl(OrderTransferFragment.class, "vb", "getVb()Lcom/kubi/otc/databinding/PaymentFragmentP2pOrderTransferBinding;", 0))};

    /* JADX INFO: renamed from: W */
    @NotNull
    public static final Companion f39885W = new Companion(null);

    /* JADX INFO: compiled from: OrderTransferFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/payment/p2p/order/transfer/OrderTransferFragment$Companion;", "", "<init>", "()V", "REQUEST_CODE_SELECT_PICTURE", "", "MAX_SELECT_PICTURE_NUM", "PAY_TYPE_WIRE_TRANSFER", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.p2p.order.transfer.OrderTransferFragment$a */
    /* JADX INFO: compiled from: OrderTransferFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21178a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f39888b;

        public C21178a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f39888b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f39888b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39888b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.p2p.order.transfer.OrderTransferFragment$b */
    /* JADX INFO: compiled from: OrderTransferFragment.kt */
    @Metadata(m90083d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0010\u0010\u0006\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, m90084d2 = {"com/kubi/payment/p2p/order/transfer/OrderTransferFragment$showQrCode$1$1", "Lcom/bumptech/glide/request/target/SimpleTarget;", "Landroid/graphics/Bitmap;", "onResourceReady", "", InterfaceC33617e1.f69660i, "transition", "Lcom/bumptech/glide/request/transition/Transition;", "onLoadFailed", "errorDrawable", "Landroid/graphics/drawable/Drawable;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21179b extends AbstractC42397h<Bitmap> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ TextView f39889e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ProgressBar f39890f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ImageView f39891g;

        public C21179b(TextView textView, ProgressBar progressBar, ImageView imageView) {
            this.f39889e = textView;
            this.f39890f = progressBar;
            this.f39891g = imageView;
        }

        @Override // p445m2.InterfaceC42399j
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo6639e(Bitmap resource, InterfaceC42704b<? super Bitmap> interfaceC42704b) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            TextView textView = this.f39889e;
            if (textView != null) {
                textView.setEnabled(true);
            }
            ProgressBar progressBar = this.f39890f;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            ImageView imageView = this.f39891g;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ImageView imageView2 = this.f39891g;
            if (imageView2 != null) {
                imageView2.setImageBitmap(resource);
            }
        }

        @Override // p445m2.AbstractC42390a, p445m2.InterfaceC42399j
        /* JADX INFO: renamed from: i */
        public void mo6640i(Drawable drawable) {
            super.mo6640i(drawable);
            TextView textView = this.f39889e;
            if (textView != null) {
                textView.setEnabled(false);
            }
            ProgressBar progressBar = this.f39890f;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            ImageView imageView = this.f39891g;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ImageView imageView2 = this.f39891g;
            if (imageView2 != null) {
                imageView2.setImageResource(R$mipmap.kucoin_icon_placeholder);
            }
        }
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m48919B4(View view, final OrderTransferFragment orderTransferFragment, Boolean bool) {
        final String str = C5302w.m6508c() + "/share" + System.currentTimeMillis() + ".jpg";
        if (bool.booleanValue() && C5290q.m6359j(C5290q.m6362m(view), str, Bitmap.CompressFormat.JPEG)) {
            C27100x0.m66924e(new Function0() { // from class: com.kubi.payment.p2p.order.transfer.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderTransferFragment.m48921C4(str, orderTransferFragment);
                }
            });
            ToastCompat.m66437C(R$string.save_success);
        } else {
            ToastCompat.m66437C(R$string.tips_save_failed);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m48933J4(String str, String str2, OrderTransferFragment orderTransferFragment, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        viewHolder.setText(R$id.tv_title, str).setText(R$id.tv_phone, str2).setText(R$id.tv_tip, orderTransferFragment.getString(R$string.payment_p2p_paytype_phone, str));
        View view = viewHolder.getView(R$id.tv_copy);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        View view2 = viewHolder.getView(R$id.iv_close_dialog);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66681D(new View[]{view, view2}, new Function0() { // from class: com.kubi.payment.p2p.order.transfer.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderTransferFragment.m48935K4(dialogFragmentHelper);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M4 */
    public static final Unit m48938M4(final OrderTransferFragment orderTransferFragment, String str, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        ProgressBar progressBar = (ProgressBar) viewHolder.getView(R$id.progress_bar);
        final ImageView imageView = (ImageView) viewHolder.getView(R$id.iv_qr_code);
        TextView textView = (TextView) viewHolder.getView(R$id.tv_save_qrcode);
        C46338a.m102151a(orderTransferFragment.mContext).mo6621d().mo6601L0(str).m6591B0(new C21179b(textView, progressBar, imageView));
        Intrinsics.checkNotNull(textView);
        C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.transfer.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderTransferFragment.m48940N4(this.f39938b, imageView);
            }
        }, 1, null);
        viewHolder.setOnClickListener(R$id.iv_close_dialog, new View.OnClickListener() { // from class: com.kubi.payment.p2p.order.transfer.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OrderTransferFragment.m48950S4(dialogFragmentHelper, view);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O4 */
    public static final Unit m48942O4(final OrderTransferFragment orderTransferFragment, ImageView imageView, Boolean bool) {
        AdPayType currentPayType;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C5302w.m6508c());
        sb2.append('/');
        TransferOrderInfo f39904i0 = ((OrderTransferViewModel) orderTransferFragment.m45631m3()).getF39904i0();
        sb2.append(C27041f.m66668h((f39904i0 == null || (currentPayType = f39904i0.getCurrentPayType()) == null) ? null : currentPayType.getPayTypeCode()));
        sb2.append(System.currentTimeMillis());
        sb2.append(".jpg");
        final String string = sb2.toString();
        if (bool.booleanValue() && C5290q.m6359j(C5290q.m6362m(imageView), string, Bitmap.CompressFormat.JPEG)) {
            C27100x0.m66924e(new Function0() { // from class: com.kubi.payment.p2p.order.transfer.y
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderTransferFragment.m48944P4(string, orderTransferFragment);
                }
            });
            orderTransferFragment.showToast(orderTransferFragment.getString(R$string.save_qrcode_ok, string));
        } else {
            ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.failed, new Object[0]), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    private final void m48961e4() {
        OrderProcessDialog.Companion companion = OrderProcessDialog.f39763s0;
        TransferOrderInfo f39904i0 = ((OrderTransferViewModel) m45631m3()).getF39904i0();
        companion.clearDialogStore(true, f39904i0 != null ? f39904i0.getId() : null, false, 2);
    }

    /* JADX INFO: renamed from: j4 */
    public static final Unit m48965j4(OrderTransferFragment orderTransferFragment) {
        OtcDepend.f38138a.m45471u(orderTransferFragment.getActivity(), "p2pOrder");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l4 */
    public static final Unit m48967l4(OrderTransferFragment orderTransferFragment) {
        C4400a c4400aM56184f = Router.f46192a.m56184f(FlutterUtils.m48217b(FlutterUtils.f39512a, "payment/p2p/cancelOrder", false, 2, null));
        TransferOrderInfo f39904i0 = ((OrderTransferViewModel) orderTransferFragment.m45631m3()).getF39904i0();
        C4400a c4400aM4038a = c4400aM56184f.m4038a("orderId", f39904i0 != null ? f39904i0.getId() : null);
        TransferOrderInfo f39904i1 = ((OrderTransferViewModel) orderTransferFragment.m45631m3()).getF39904i0();
        C4400a c4400aM4038a2 = c4400aM4038a.m4038a("orderStatus", f39904i1 != null ? f39904i1.getStatus() : null);
        TransferOrderInfo f39904i2 = ((OrderTransferViewModel) orderTransferFragment.m45631m3()).getF39904i0();
        C4400a c4400aM4038a3 = c4400aM4038a2.m4038a("fiatCurrency", C27041f.m66668h(f39904i2 != null ? f39904i2.getLegalCurrency() : null));
        TransferOrderInfo f39904i3 = ((OrderTransferViewModel) orderTransferFragment.m45631m3()).getF39904i0();
        c4400aM4038a3.m4038a("cryptoCurrency", C27041f.m66668h(f39904i3 != null ? f39904i3.getCryptoCurrency() : null)).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m48971q4(boolean z11, OrderTransferFragment orderTransferFragment, boolean z12, PayTemplate payTemplate, String str, CharSequence charSequence) {
        if (z11) {
            orderTransferFragment.m48990L4();
        } else if (z12) {
            orderTransferFragment.m48989I4(C27041f.m66668h(payTemplate.getValue()), str);
        } else {
            C27057k.m66746b(charSequence);
            ToastCompat.m66441G(orderTransferFragment.getString(R$string.copy_success), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m48973s4(TransferOrderInfo transferOrderInfo, OrderTransferFragment orderTransferFragment) {
        C27057k.m66746b(transferOrderInfo != null ? transferOrderInfo.getKycName() : null);
        ToastCompat.m66441G(orderTransferFragment.getString(R$string.copy_success), new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y4 */
    public static final void m48984y4(OrderTransferFragment orderTransferFragment, Object obj) {
        OtcDepend.m45452s(OtcDepend.f38138a, orderTransferFragment, 0, 1, 2, null);
    }

    /* JADX INFO: renamed from: A4 */
    public final void m48987A4(final View view) {
        Observable<Boolean> observableM49936e = PermissionCompatKt.m49936e(new C46126b(this), "android.permission.WRITE_EXTERNAL_STORAGE");
        final Function1 function1 = new Function1() { // from class: com.kubi.payment.p2p.order.transfer.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderTransferFragment.m48919B4(view, this, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.payment.p2p.order.transfer.n
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OrderTransferFragment.m48925E4(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.payment.p2p.order.transfer.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderTransferFragment.m48927F4((Throwable) obj);
            }
        };
        Disposable disposableSubscribe = observableM49936e.subscribe(consumer, new Consumer() { // from class: com.kubi.payment.p2p.order.transfer.p
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OrderTransferFragment.m48929G4(function2, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    /* JADX INFO: renamed from: I4 */
    public final void m48989I4(final String str, final String str2) {
        if (str2 == null || str2.length() == 0) {
            return;
        }
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.botc_dialog_phone, 1, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: com.kubi.payment.p2p.order.transfer.k
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OrderTransferFragment.m48933J4(str, str2, this, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(childFragmentManager, "showPhoneDialog");
    }

    /* JADX INFO: renamed from: g4 */
    public final C37693u1 m48992g4() {
        return (C37693u1) this.f39887V.getValue(this, f39886X[0]);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.payment_fragment_p2p_order_transfer;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:47:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x011d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0122  */
    /* JADX WARN: Code duplicated, block: B:73:0x012f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x012f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0032 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p4 */
    public final void m48993p4() {
        LinearLayout linearLayout;
        PayTypeEntity payTypeTemplate;
        List<PayTemplate> template;
        final boolean z11;
        final CharSequence charSequence;
        C27096v0 c27096v0M66908h;
        C37693u1 c37693u1M48992g4;
        LinearLayout linearLayout2;
        String payQrcodePic;
        TransferOrderInfo f39904i0 = ((OrderTransferViewModel) m45631m3()).getF39904i0();
        AdPayType currentPayType = f39904i0 != null ? f39904i0.getCurrentPayType() : null;
        TransferOrderInfo f39904i1 = ((OrderTransferViewModel) m45631m3()).getF39904i0();
        if (f39904i1 != null && (payTypeTemplate = f39904i1.getPayTypeTemplate()) != null && (template = payTypeTemplate.getTemplate()) != null) {
            for (final PayTemplate payTemplate : template) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.botc_view_order_info_item, (ViewGroup) null);
                final boolean zAreEqual = Intrinsics.areEqual(payTemplate.getKey(), "payQrcodePic");
                Object obj = ((OrderTransferViewModel) m45631m3()).m49022R().get(C27041f.m66668h(payTemplate.getKey()));
                final String strM66668h = C27041f.m66668h(obj instanceof String ? (String) obj : null);
                boolean z12 = true;
                if (!Intrinsics.areEqual(payTemplate.getKey(), HintConstants.AUTOFILL_HINT_PHONE)) {
                    z11 = false;
                } else if (!(currentPayType != null ? Intrinsics.areEqual(currentPayType.getPhoneNoPayTip(), Boolean.TRUE) : false)) {
                    z11 = false;
                } else if (strM66668h.length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                BaseViewHolder baseViewHolder = new BaseViewHolder(viewInflate);
                baseViewHolder.setText(R$id.tv_label, C27041f.m66668h(payTemplate.getValue()));
                TextView textView = (TextView) baseViewHolder.getView(R$id.tv_value);
                Intrinsics.checkNotNull(textView);
                C27046k.m66694i(textView, (zAreEqual || z11) ? 0 : R$drawable.ic_copy_16, 0, 0, 6, null);
                C22912t.m54411i(textView, getColorRes(R$color.c_icon60));
                if (zAreEqual) {
                    c27096v0M66908h = new C27096v0().m66908h(getString(R$string.payment_detail_view_qr_code));
                } else {
                    if (z11) {
                        c27096v0M66908h = new C27096v0().m66908h(getString(R$string.payment_p2p_view));
                    } else {
                        charSequence = strM66668h;
                    }
                    textView.setText(charSequence);
                    C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.transfer.f0
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OrderTransferFragment.m48971q4(zAreEqual, this, z11, payTemplate, strM66668h, charSequence);
                        }
                    }, 1, null);
                    if (!zAreEqual) {
                        if (currentPayType != null) {
                            payQrcodePic = currentPayType.getPayQrcodePic();
                        } else {
                            payQrcodePic = null;
                        }
                        if (payQrcodePic != null && payQrcodePic.length() != 0) {
                            z12 = false;
                        }
                        if (!z12) {
                        }
                    }
                    c37693u1M48992g4 = m48992g4();
                    if (c37693u1M48992g4 == null && (linearLayout2 = c37693u1M48992g4.f84729z) != null) {
                        linearLayout2.addView(viewInflate);
                    }
                }
                charSequence = c27096v0M66908h;
                textView.setText(charSequence);
                C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.transfer.f0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OrderTransferFragment.m48971q4(zAreEqual, this, z11, payTemplate, strM66668h, charSequence);
                    }
                }, 1, null);
                if (!zAreEqual) {
                    if (currentPayType != null) {
                        payQrcodePic = currentPayType.getPayQrcodePic();
                    } else {
                        payQrcodePic = null;
                    }
                    if (payQrcodePic != null) {
                        z12 = false;
                    }
                    if (!z12) {
                    }
                }
                c37693u1M48992g4 = m48992g4();
                if (c37693u1M48992g4 == null) {
                }
            }
        }
        if (Intrinsics.areEqual(currentPayType != null ? currentPayType.getPayTypeCode() : null, "WIRE_TRANSFER")) {
            TextView textView2 = new TextView(this.mContext);
            textView2.setText(getString(R$string.save_wire_transfer));
            textView2.setTextSize(14.0f);
            textView2.setTextColor(ContextCompat.getColor(this.mContext, R$color.primary));
            C37693u1 c37693u1M48992g5 = m48992g4();
            if (c37693u1M48992g5 != null && (linearLayout = c37693u1M48992g5.f84729z) != null) {
                linearLayout.addView(textView2);
            }
            ViewExtKt.m66585p(textView2, 0, C27029c.m66603f(this, 12), 0, 0, 13, null);
            C27046k.m66711z(textView2, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.transfer.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderTransferFragment.m48972r4(this.f39909b);
                }
            }, 1, null);
        }
    }

    @Override // com.kubi.payment.base.BaseFragment
    @NotNull
    /* JADX INFO: renamed from: s3 */
    public KClass<OrderTransferViewModel> mo45635s3() {
        return Reflection.getOrCreateKotlinClass(OrderTransferViewModel.class);
    }

    public OrderTransferFragment() {
        setPageId("B7P2POrderPaymentDetail");
    }

    /* JADX INFO: renamed from: C4 */
    public static final Unit m48921C4(String str, OrderTransferFragment orderTransferFragment) {
        if (!TextUtils.isEmpty(str)) {
            MediaScannerConnection.scanFile(orderTransferFragment.getActivity(), new String[]{str}, new String[]{"image/jpeg"}, new MediaScannerConnection.OnScanCompletedListener() { // from class: com.kubi.payment.p2p.order.transfer.x
                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public final void onScanCompleted(String str2, Uri uri) {
                    OrderTransferFragment.m48923D4(str2, uri);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E4 */
    public static final void m48925E4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F4 */
    public static final Unit m48927F4(Throwable th2) {
        th2.printStackTrace();
        ToastCompat.m66437C(R$string.tips_save_failed);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G4 */
    public static final void m48929G4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: K4 */
    public static final Unit m48935K4(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N4 */
    public static final Unit m48940N4(final OrderTransferFragment orderTransferFragment, final ImageView imageView) {
        C46126b rxPermissions = orderTransferFragment.getRxPermissions();
        Intrinsics.checkNotNullExpressionValue(rxPermissions, "getRxPermissions(...)");
        Observable<Boolean> observableM49936e = PermissionCompatKt.m49936e(rxPermissions, "android.permission.WRITE_EXTERNAL_STORAGE");
        final Function1 function1 = new Function1() { // from class: com.kubi.payment.p2p.order.transfer.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderTransferFragment.m48942O4(this.f39944b, imageView, (Boolean) obj);
            }
        };
        Disposable disposableSubscribe = observableM49936e.subscribe(new Consumer() { // from class: com.kubi.payment.p2p.order.transfer.v
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                OrderTransferFragment.m48948R4(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = orderTransferFragment.getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P4 */
    public static final Unit m48944P4(String str, OrderTransferFragment orderTransferFragment) {
        if (TextUtils.isEmpty(str)) {
            return Unit.INSTANCE;
        }
        MediaScannerConnection.scanFile(orderTransferFragment.mContext, new String[]{str}, new String[]{"image/jpeg"}, new MediaScannerConnection.OnScanCompletedListener() { // from class: com.kubi.payment.p2p.order.transfer.a
            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public final void onScanCompleted(String str2, Uri uri) {
                OrderTransferFragment.m48946Q4(str2, uri);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R4 */
    public static final void m48948R4(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: S4 */
    public static final void m48950S4(DialogFragmentHelper dialogFragmentHelper, View view) {
        dialogFragmentHelper.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b4 */
    public static final /* synthetic */ OrderTransferViewModel m48959b4(OrderTransferFragment orderTransferFragment) {
        return (OrderTransferViewModel) orderTransferFragment.m45631m3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f4 */
    private final void m48962f4(long j11) {
        String id2;
        if (j11 <= 600000 && !((OrderTransferViewModel) m45631m3()).getF39906k0()) {
            TransferOrderInfo f39904i0 = ((OrderTransferViewModel) m45631m3()).getF39904i0();
            if (f39904i0 != null) {
                id2 = f39904i0.getId();
            } else {
                id2 = null;
            }
            if (id2 != null && id2.length() != 0) {
                Boolean value = ((OrderTransferViewModel) m45631m3()).m49016K().getValue();
                Boolean bool = Boolean.TRUE;
                if (!Intrinsics.areEqual(value, bool) && !Intrinsics.areEqual(((OrderTransferViewModel) m45631m3()).m49029Y().getValue(), bool)) {
                    if (!C46392a.m102322d(PaymentStorageId.f40364a.m49847y(id2, 2), false)) {
                        OrderProcessDialog.f39763s0.show(this, id2, 2);
                    }
                    ((OrderTransferViewModel) m45631m3()).m49031a0(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: h4 */
    private final void m48963h4() {
        BaseTextView baseTextView;
        P2PViewChatCardEntrance p2PViewChatCardEntrance;
        KcPrimaryButton kcPrimaryButton;
        BaseTextView baseTextView2;
        AppCompatImageView appCompatImageView;
        ImageView imageView;
        C37693u1 c37693u1M48992g4 = m48992g4();
        if (c37693u1M48992g4 != null && (imageView = c37693u1M48992g4.f84707d) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.transfer.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderTransferFragment.m48964i4(this.f39911b);
                }
            }, 1, null);
        }
        C37693u1 c37693u1M48992g5 = m48992g4();
        if (c37693u1M48992g5 != null && (appCompatImageView = c37693u1M48992g5.f84708e) != null) {
            C27046k.m66711z(appCompatImageView, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.transfer.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderTransferFragment.m48965j4(this.f39913b);
                }
            }, 1, null);
        }
        C37693u1 c37693u1M48992g6 = m48992g4();
        if (c37693u1M48992g6 != null && (baseTextView2 = c37693u1M48992g6.f84716m) != null) {
            C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.transfer.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderTransferFragment.m48966k4(this.f39915b);
                }
            }, 1, null);
        }
        C37693u1 c37693u1M48992g7 = m48992g4();
        if (c37693u1M48992g7 != null && (kcPrimaryButton = c37693u1M48992g7.f84712i) != null) {
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.transfer.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderTransferFragment.m48968m4(this.f39918b);
                }
            }, 1, null);
        }
        C37693u1 c37693u1M48992g8 = m48992g4();
        if (c37693u1M48992g8 != null && (p2PViewChatCardEntrance = c37693u1M48992g8.f84728y) != null) {
            p2PViewChatCardEntrance.setOnChatClickListener(new Function0() { // from class: com.kubi.payment.p2p.order.transfer.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderTransferFragment.m48969n4(this.f39925b);
                }
            });
        }
        C37693u1 c37693u1M48992g9 = m48992g4();
        if (c37693u1M48992g9 != null && (baseTextView = c37693u1M48992g9.f84717n) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.transfer.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderTransferFragment.m48970o4(this.f39926b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: i4 */
    public static final Unit m48964i4(OrderTransferFragment orderTransferFragment) {
        orderTransferFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static final Unit m48966k4(final OrderTransferFragment orderTransferFragment) {
        String legalCurrency;
        String cryptoCurrency;
        Boolean boolIsP2PExpress;
        String legalCurrency2;
        String cryptoCurrency2;
        TransferOrderInfo f39904i0 = ((OrderTransferViewModel) orderTransferFragment.m45631m3()).getF39904i0();
        String status = null;
        if (f39904i0 != null) {
            legalCurrency = f39904i0.getLegalCurrency();
        } else {
            legalCurrency = null;
        }
        Pair pairM90091to = TuplesKt.m90091to("pay_fiat_currency", C27041f.m66668h(legalCurrency));
        TransferOrderInfo f39904i1 = ((OrderTransferViewModel) orderTransferFragment.m45631m3()).getF39904i0();
        if (f39904i1 != null) {
            cryptoCurrency = f39904i1.getCryptoCurrency();
        } else {
            cryptoCurrency = null;
        }
        Pair pairM90091to2 = TuplesKt.m90091to("pay_crypto_currency", C27041f.m66668h(cryptoCurrency));
        TransferOrderInfo f39904i2 = ((OrderTransferViewModel) orderTransferFragment.m45631m3()).getF39904i0();
        if (f39904i2 != null) {
            boolIsP2PExpress = f39904i2.isP2PExpress();
        } else {
            boolIsP2PExpress = null;
        }
        C43852m.m96590b("B7P2POrderPaymentDetail", "upCancelButton", "1", pairM90091to, pairM90091to2, TuplesKt.m90091to("isP2PExpress", Boolean.valueOf(C27025c.m66566d(boolIsP2PExpress))), TuplesKt.m90091to("pay_side", "buy"), TuplesKt.m90091to("norm_version", "1"));
        C37265w c37265w = C37265w.f82633a;
        Context mContext = orderTransferFragment.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        FragmentManager childFragmentManager = orderTransferFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        TransferOrderInfo f39904i3 = ((OrderTransferViewModel) orderTransferFragment.m45631m3()).getF39904i0();
        if (f39904i3 != null) {
            legalCurrency2 = f39904i3.getLegalCurrency();
        } else {
            legalCurrency2 = null;
        }
        TransferOrderInfo f39904i4 = ((OrderTransferViewModel) orderTransferFragment.m45631m3()).getF39904i0();
        if (f39904i4 != null) {
            cryptoCurrency2 = f39904i4.getCryptoCurrency();
        } else {
            cryptoCurrency2 = null;
        }
        TransferOrderInfo f39904i5 = ((OrderTransferViewModel) orderTransferFragment.m45631m3()).getF39904i0();
        if (f39904i5 != null) {
            status = f39904i5.getStatus();
        }
        c37265w.m83409y(mContext, childFragmentManager, legalCurrency2, cryptoCurrency2, status, new Function0() { // from class: com.kubi.payment.p2p.order.transfer.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OrderTransferFragment.m48967l4(this.f39927b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m4 */
    public static final Unit m48968m4(OrderTransferFragment orderTransferFragment) {
        String legalCurrency;
        String cryptoCurrency;
        TransferOrderInfo f39904i0 = ((OrderTransferViewModel) orderTransferFragment.m45631m3()).getF39904i0();
        Boolean boolIsP2PExpress = null;
        if (f39904i0 != null) {
            legalCurrency = f39904i0.getLegalCurrency();
        } else {
            legalCurrency = null;
        }
        Pair pairM90091to = TuplesKt.m90091to("pay_fiat_currency", C27041f.m66668h(legalCurrency));
        TransferOrderInfo f39904i1 = ((OrderTransferViewModel) orderTransferFragment.m45631m3()).getF39904i0();
        if (f39904i1 != null) {
            cryptoCurrency = f39904i1.getCryptoCurrency();
        } else {
            cryptoCurrency = null;
        }
        Pair pairM90091to2 = TuplesKt.m90091to("pay_crypto_currency", C27041f.m66668h(cryptoCurrency));
        TransferOrderInfo f39904i2 = ((OrderTransferViewModel) orderTransferFragment.m45631m3()).getF39904i0();
        if (f39904i2 != null) {
            boolIsP2PExpress = f39904i2.isP2PExpress();
        }
        C43852m.m96590b("B7P2POrderPaymentDetail", "paidButton", "1", pairM90091to, pairM90091to2, TuplesKt.m90091to("isP2PExpress", Boolean.valueOf(C27025c.m66566d(boolIsP2PExpress))));
        PaymentCompleteDialog.f39769x0.show(orderTransferFragment);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n4 */
    public static final Unit m48969n4(OrderTransferFragment orderTransferFragment) {
        Boolean boolIsP2PExpress;
        TransferOrderInfo f39904i0 = ((OrderTransferViewModel) orderTransferFragment.m45631m3()).getF39904i0();
        if (f39904i0 != null) {
            boolIsP2PExpress = f39904i0.isP2PExpress();
        } else {
            boolIsP2PExpress = null;
        }
        C43852m.m96590b("B7P2POrderDetails", "contactUser", "1", TuplesKt.m90091to("isP2PExpress", Boolean.valueOf(C27025c.m66566d(boolIsP2PExpress))));
        OrderDetailFragment.f39721a0.toChat();
        FragmentActivity activity = orderTransferFragment.getActivity();
        if (activity != null) {
            activity.setResult(-1, new Intent().putExtra("data", true));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    public static final Unit m48970o4(OrderTransferFragment orderTransferFragment) {
        String strM66668h;
        String legalCurrencyAmount;
        TransferOrderInfo f39904i0 = ((OrderTransferViewModel) orderTransferFragment.m45631m3()).getF39904i0();
        if (f39904i0 != null && (legalCurrencyAmount = f39904i0.getLegalCurrencyAmount()) != null) {
            strM66668h = C27041f.m66668h(legalCurrencyAmount);
        } else {
            strM66668h = null;
        }
        C27057k.m66746b(strM66668h);
        ToastCompat.m66441G(orderTransferFragment.getString(R$string.copy_success), new Object[0]);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m48972r4(OrderTransferFragment orderTransferFragment) {
        orderTransferFragment.m48988H4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m48974t4(Boolean bool) {
        if (bool.booleanValue()) {
            ToastCompat.m66437C(R$string.upload_fail);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m48976u4(OrderTransferFragment orderTransferFragment, Boolean bool) {
        if (bool.booleanValue()) {
            orderTransferFragment.m48961e4();
            orderTransferFragment.m48991d4();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final Unit m48978v4(OrderTransferFragment orderTransferFragment, Boolean bool) {
        if (bool.booleanValue()) {
            orderTransferFragment.m48961e4();
            orderTransferFragment.m48991d4();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w4 */
    public static final Unit m48980w4(OrderTransferFragment orderTransferFragment, Long l11) {
        BaseTextView baseTextView;
        Intrinsics.checkNotNull(l11);
        String strM66417d = TimeUtils.m66417d(l11.longValue());
        C37693u1 c37693u1M48992g4 = orderTransferFragment.m48992g4();
        if (c37693u1M48992g4 != null && (baseTextView = c37693u1M48992g4.f84725v) != null) {
            SpannableString spannableString = new SpannableString(orderTransferFragment.getString(R$string.payment_p2p_order_transfer_subtitle, strM66417d));
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(orderTransferFragment.getColorRes(R$color.primary));
            Intrinsics.checkNotNull(strM66417d);
            spannableString.setSpan(foregroundColorSpan, StringsKt.indexOf$default((CharSequence) spannableString, strM66417d, 0, false, 6, (Object) null), StringsKt.indexOf$default((CharSequence) spannableString, strM66417d, 0, false, 6, (Object) null) + strM66417d.length(), 18);
            baseTextView.setText(spannableString);
        }
        orderTransferFragment.m48962f4(l11.longValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m48982x4(OrderTransferFragment orderTransferFragment, P2PViewChatCardEntrance.P2PChatCardEntranceInfo p2PChatCardEntranceInfo) {
        P2PViewChatCardEntrance p2PViewChatCardEntrance;
        P2PViewChatCardEntrance p2PViewChatCardEntrance2;
        C37693u1 c37693u1M48992g4 = orderTransferFragment.m48992g4();
        if (c37693u1M48992g4 != null && (p2PViewChatCardEntrance2 = c37693u1M48992g4.f84728y) != null) {
            C27046k.m66685H(p2PViewChatCardEntrance2);
        }
        C37693u1 c37693u1M48992g5 = orderTransferFragment.m48992g4();
        if (c37693u1M48992g5 != null && (p2PViewChatCardEntrance = c37693u1M48992g5.f84728y) != null) {
            Intrinsics.checkNotNull(p2PChatCardEntranceInfo);
            p2PViewChatCardEntrance.m49414h(p2PChatCardEntranceInfo);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m48986z4(OrderTransferFragment orderTransferFragment, Boolean bool) {
        if (bool.booleanValue()) {
            orderTransferFragment.m48993p4();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H4 */
    public final void m48988H4() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new OrderTransferFragment$saveWireImage$1(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L4 */
    public final void m48990L4() {
        final String payQrcodePic;
        AdPayType currentPayType;
        TransferOrderInfo f39904i0 = ((OrderTransferViewModel) m45631m3()).getF39904i0();
        if (f39904i0 != null && (currentPayType = f39904i0.getCurrentPayType()) != null) {
            payQrcodePic = currentPayType.getPayQrcodePic();
        } else {
            payQrcodePic = null;
        }
        if (payQrcodePic != null && payQrcodePic.length() != 0) {
            DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.Companion.newInstance$default(DialogFragmentHelper.f43568p0, R$layout.botc_dialog_qr_code, 1, 0, 0, false, false, false, false, false, 508, null).m54237f4(new Function2() { // from class: com.kubi.payment.p2p.order.transfer.j
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OrderTransferFragment.m48938M4(this.f39928b, payQrcodePic, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
                }
            });
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            dialogFragmentHelperM54237f4.show(childFragmentManager, "showQrCode");
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final void m48991d4() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1);
        }
        preformBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.p2p.order.OrderCountdownOwner
    @NotNull
    /* JADX INFO: renamed from: f1 */
    public LiveData<Long> mo48711f1() {
        return ((OrderTransferViewModel) m45631m3()).m49013H();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BaseFragment
    /* JADX INFO: renamed from: n3 */
    public void mo45632n3() {
        TransferOrderInfo transferOrderInfo;
        Boolean boolIsP2PExpress;
        Group group;
        StepsLayout stepsLayout;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        String kycName;
        BaseTextView baseTextView3;
        String payTypeName;
        AdPayType currentPayType;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        String legalCurrencyAmount;
        String legalCurrency;
        BaseTextView baseTextView6;
        String payTypeName2;
        AdPayType currentPayType2;
        Group group2;
        BaseTextView baseTextView7;
        String hedgeMidCurrency;
        String toCurrency;
        BaseTextView baseTextView8;
        String hedgeMidCurrency2;
        OrderTransferViewModel orderTransferViewModel = (OrderTransferViewModel) m45631m3();
        Bundle arguments = getArguments();
        if (arguments != null) {
            transferOrderInfo = (TransferOrderInfo) arguments.getParcelable("data");
        } else {
            transferOrderInfo = null;
        }
        orderTransferViewModel.m49026V(transferOrderInfo);
        final TransferOrderInfo f39904i0 = ((OrderTransferViewModel) m45631m3()).getF39904i0();
        if (f39904i0 != null) {
            boolIsP2PExpress = f39904i0.isP2PExpress();
        } else {
            boolIsP2PExpress = null;
        }
        if (C27025c.m66566d(boolIsP2PExpress)) {
            C37693u1 c37693u1M48992g4 = m48992g4();
            if (c37693u1M48992g4 != null && (baseTextView8 = c37693u1M48992g4.f84721r) != null) {
                int i11 = R$string.p2pexpress_buycropty_title;
                if (f39904i0 != null) {
                    hedgeMidCurrency2 = f39904i0.getHedgeMidCurrency();
                } else {
                    hedgeMidCurrency2 = null;
                }
                baseTextView8.setText(getStringRes(i11, hedgeMidCurrency2));
            }
            C37693u1 c37693u1M48992g5 = m48992g4();
            if (c37693u1M48992g5 != null && (baseTextView7 = c37693u1M48992g5.f84723t) != null) {
                int i12 = R$string.p2pexpress_confirm_covert;
                if (f39904i0 != null) {
                    hedgeMidCurrency = f39904i0.getHedgeMidCurrency();
                } else {
                    hedgeMidCurrency = null;
                }
                if (f39904i0 != null) {
                    toCurrency = f39904i0.getToCurrency();
                } else {
                    toCurrency = null;
                }
                baseTextView7.setText(getStringRes(i12, hedgeMidCurrency, toCurrency));
            }
            C37693u1 c37693u1M48992g6 = m48992g4();
            if (c37693u1M48992g6 != null && (group2 = c37693u1M48992g6.f84706c) != null) {
                C27046k.m66685H(group2);
            }
        } else {
            C37693u1 c37693u1M48992g7 = m48992g4();
            if (c37693u1M48992g7 != null && (group = c37693u1M48992g7.f84706c) != null) {
                C27046k.m66700o(group);
            }
        }
        C37693u1 c37693u1M48992g8 = m48992g4();
        if (c37693u1M48992g8 != null && (baseTextView6 = c37693u1M48992g8.f84726w) != null) {
            int i13 = R$string.payment_p2p_order_transfer_title;
            if (f39904i0 != null && (currentPayType2 = f39904i0.getCurrentPayType()) != null) {
                payTypeName2 = currentPayType2.getPayTypeName();
            } else {
                payTypeName2 = null;
            }
            baseTextView6.setText(getString(i13, C27041f.m66668h(payTypeName2)));
        }
        C37693u1 c37693u1M48992g9 = m48992g4();
        if (c37693u1M48992g9 != null && (baseTextView5 = c37693u1M48992g9.f84717n) != null) {
            StringBuilder sb2 = new StringBuilder();
            if (f39904i0 != null) {
                legalCurrencyAmount = f39904i0.getLegalCurrencyAmount();
            } else {
                legalCurrencyAmount = null;
            }
            sb2.append(C27041f.m66668h(legalCurrencyAmount));
            sb2.append(' ');
            if (f39904i0 != null) {
                legalCurrency = f39904i0.getLegalCurrency();
            } else {
                legalCurrency = null;
            }
            sb2.append(legalCurrency);
            baseTextView5.setText(sb2.toString());
        }
        C37693u1 c37693u1M48992g10 = m48992g4();
        if (c37693u1M48992g10 != null && (baseTextView4 = c37693u1M48992g10.f84719p) != null) {
            baseTextView4.setText(getString(R$string.payment_p2p_order_transfer_step2_tips_desc1) + '\n' + getString(R$string.payment_p2p_order_transfer_step2_tips_desc2) + '\n' + getString(R$string.payment_p2p_order_transfer_step2_tips_desc3));
        }
        C37693u1 c37693u1M48992g11 = m48992g4();
        if (c37693u1M48992g11 != null && (baseTextView3 = c37693u1M48992g11.f84724u) != null) {
            int i14 = R$string.payment_p2p_open_pay;
            if (f39904i0 != null && (currentPayType = f39904i0.getCurrentPayType()) != null) {
                payTypeName = currentPayType.getPayTypeName();
            } else {
                payTypeName = null;
            }
            baseTextView3.setText(getString(i14, C27041f.m66668h(payTypeName)));
        }
        C37693u1 c37693u1M48992g12 = m48992g4();
        if (c37693u1M48992g12 != null && (baseTextView2 = c37693u1M48992g12.f84714k) != null) {
            if (f39904i0 != null) {
                kycName = f39904i0.getKycName();
            } else {
                kycName = null;
            }
            baseTextView2.setText(kycName);
        }
        C37693u1 c37693u1M48992g13 = m48992g4();
        if (c37693u1M48992g13 != null && (baseTextView = c37693u1M48992g13.f84714k) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.payment.p2p.order.transfer.e0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OrderTransferFragment.m48973s4(f39904i0, this);
                }
            }, 1, null);
        }
        OrderTransferViewModel.m49001c0((OrderTransferViewModel) m45631m3(), 0L, 1, null);
        m48963h4();
        C37693u1 c37693u1M48992g14 = m48992g4();
        if (c37693u1M48992g14 != null && (stepsLayout = c37693u1M48992g14.f84711h) != null) {
            StepsLayout.m49908b(stepsLayout, 0, 0, 2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.payment.base.BaseFragment
    /* JADX INFO: renamed from: o3 */
    public void mo45633o3() {
        super.mo45633o3();
        ((OrderTransferViewModel) m45631m3()).m49019N().observe(getViewLifecycleOwner(), new C21178a(new Function1() { // from class: com.kubi.payment.p2p.order.transfer.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderTransferFragment.m48986z4(this.f39933b, (Boolean) obj);
            }
        }));
        ((OrderTransferViewModel) m45631m3()).m49024T().observe(getViewLifecycleOwner(), new C21178a(new Function1() { // from class: com.kubi.payment.p2p.order.transfer.w
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderTransferFragment.m48974t4((Boolean) obj);
            }
        }));
        ((OrderTransferViewModel) m45631m3()).m49016K().observe(getViewLifecycleOwner(), new C21178a(new Function1() { // from class: com.kubi.payment.p2p.order.transfer.z
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderTransferFragment.m48976u4(this.f39949b, (Boolean) obj);
            }
        }));
        ((OrderTransferViewModel) m45631m3()).m49029Y().observe(getViewLifecycleOwner(), new C21178a(new Function1() { // from class: com.kubi.payment.p2p.order.transfer.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderTransferFragment.m48978v4(this.f39908b, (Boolean) obj);
            }
        }));
        ((OrderTransferViewModel) m45631m3()).m49013H().observe(getViewLifecycleOwner(), new C21178a(new Function1() { // from class: com.kubi.payment.p2p.order.transfer.b0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderTransferFragment.m48980w4(this.f39910b, (Long) obj);
            }
        }));
        ((OrderTransferViewModel) m45631m3()).m49021Q().observe(getViewLifecycleOwner(), new C21178a(new Function1() { // from class: com.kubi.payment.p2p.order.transfer.c0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OrderTransferFragment.m48982x4(this.f39912b, (P2PViewChatCardEntrance.P2PChatCardEntranceInfo) obj);
            }
        }));
        ((OrderTransferViewModel) m45631m3()).m49023S().observe(getViewLifecycleOwner(), new Observer() { // from class: com.kubi.payment.p2p.order.transfer.d0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                OrderTransferFragment.m48984y4(this.f39914b, obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1 && data != null && requestCode == 1) {
            ((OrderTransferViewModel) m45631m3()).m49011E(OtcDepend.f38138a.m45468q(data));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.sdk.BaseFragment, com.kubi.sdk.IBackCallback
    public boolean onBackPressed() {
        String id2;
        TransferOrderInfo f39904i0 = ((OrderTransferViewModel) m45631m3()).getF39904i0();
        if (f39904i0 != null) {
            id2 = f39904i0.getId();
        } else {
            id2 = null;
        }
        if (id2 != null && id2.length() != 0) {
            StorageId<Boolean> storageIdM49847y = PaymentStorageId.f40364a.m49847y(id2, 1);
            Boolean value = ((OrderTransferViewModel) m45631m3()).m49016K().getValue();
            Boolean bool = Boolean.TRUE;
            if (!Intrinsics.areEqual(value, bool)) {
                if (!Intrinsics.areEqual(((OrderTransferViewModel) m45631m3()).m49029Y().getValue(), bool)) {
                    if (!C46392a.m102322d(storageIdM49847y, false)) {
                        OrderProcessDialog.f39763s0.show(this, id2, 1);
                        return true;
                    }
                } else if (C46392a.m102320b(storageIdM49847y)) {
                    C46392a.m102335r(storageIdM49847y);
                }
            } else if (C46392a.m102320b(storageIdM49847y)) {
                C46392a.m102335r(storageIdM49847y);
            }
        }
        return super.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        OrderTransferViewModel.m49000P((OrderTransferViewModel) m45631m3(), false, 1, null);
    }

    /* JADX INFO: renamed from: D4 */
    public static final void m48923D4(String str, Uri uri) {
    }

    /* JADX INFO: renamed from: Q4 */
    public static final void m48946Q4(String str, Uri uri) {
    }
}
