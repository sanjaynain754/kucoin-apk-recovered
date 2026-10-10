package com.kubi.payment.third.kyc.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.service.OtcDepend;
import com.kubi.payment.third.data.entities.ThirdKycItem;
import com.kubi.payment.third.kyc.view.KycIdCardView;
import com.kubi.payment.track.IPaymentTrack;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.functions.BiConsumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KycIdCardView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/payment/third/kyc/view/KycIdCardView;", "Lcom/kubi/payment/third/kyc/view/AKycBaseView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "kycItem", "Lcom/kubi/payment/third/data/entities/ThirdKycItem;", "setItemView", "", "item", "requestCode", "", "fragment", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "upload", "path", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KycIdCardView extends AKycBaseView {

    /* JADX INFO: renamed from: d */
    @Nullable
    public View f40241d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public ThirdKycItem f40242e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycIdCardView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        getInflater().inflate(R$layout.botc_view_kyc_id_card, this);
    }

    /* JADX INFO: renamed from: d */
    public final void m49587d(@NotNull ThirdKycItem item, int i11, @NotNull OldBaseFragment fragment) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f40242e = item;
        ViewGroup viewGroup = (ViewGroup) findViewById(R$id.view_image);
        if (viewGroup != null) {
            this.f40241d = OtcDepend.f38138a.m45453a(fragment, viewGroup, C27041f.m66668h(item.getHint()), i11);
        }
        setTag(Integer.valueOf(i11));
        TextView textView = (TextView) findViewById(R$id.tv_pic_name);
        if (textView != null) {
            textView.setText(item.getName());
        }
        TextView textView2 = (TextView) findViewById(R$id.tv_pic_des);
        if (textView2 != null) {
            textView2.setText(item.getElseMessage());
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m49588e(@NotNull String path, int i11) {
        View view;
        Intrinsics.checkNotNullParameter(path, "path");
        if (Intrinsics.areEqual(getTag(), Integer.valueOf(i11)) && (view = this.f40241d) != null) {
            OtcDepend.f38138a.m45472v(view, path, new BiConsumer() { // from class: lu.f
                @Override // io.reactivex.functions.BiConsumer
                public final void accept(Object obj, Object obj2) throws Exception {
                    KycIdCardView.m49586f(this.f93819b, (String) obj, (Boolean) obj2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m49586f(KycIdCardView kycIdCardView, String str, Boolean bool) throws Exception {
        String fieldName;
        if (bool.booleanValue()) {
            BiConsumer<String, String> biConsumer = kycIdCardView.getBiConsumer();
            if (biConsumer != null) {
                ThirdKycItem thirdKycItem = kycIdCardView.f40242e;
                if (thirdKycItem != null) {
                    fieldName = thirdKycItem.getFieldName();
                } else {
                    fieldName = null;
                }
                biConsumer.accept(fieldName, str);
                return;
            }
            return;
        }
        IPaymentTrack.m49797i(IPaymentTrack.f40346a.getTrack(), "CHECK_KYC_PICTURE", false, "-10002:CHECK_KYC_PICTURE", null, 10, null);
    }
}
