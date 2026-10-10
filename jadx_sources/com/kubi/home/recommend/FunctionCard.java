package com.kubi.home.recommend;

import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kubi.home.R$layout;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.newcoin.HomeRecommPosHelper;
import com.kubi.kucoin.home.cards.BaseCard;
import com.kubi.kucoin.home.cards.BaseCardData;
import com.kubi.kucoin.home.cards.ExtensionKt;
import com.kubi.kucoin.home.cards.IExposureCallback;
import com.kubi.otc.entity.OtcAd;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.core.Router;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import fj.C37544s0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p026ay.C4400a;
import p569qq.C43841b;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: FunctionCard.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0014J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/home/recommend/FunctionCard;", "Lcom/kubi/kucoin/home/cards/BaseCard;", "<init>", "()V", "kucoinLayoutHomeCardFunctionBinding", "Lcom/kubi/home/databinding/KucoinLayoutHomeCardFunctionBinding;", "getKucoinLayoutHomeCardFunctionBinding", "()Lcom/kubi/home/databinding/KucoinLayoutHomeCardFunctionBinding;", "kucoinLayoutHomeCardFunctionBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "bindToUI", "", "data", "Lcom/kubi/kucoin/home/cards/BaseCardData;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFunctionCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionCard.kt\ncom/kubi/home/recommend/FunctionCard\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,87:1\n147#2,16:88\n*S KotlinDebug\n*F\n+ 1 FunctionCard.kt\ncom/kubi/home/recommend/FunctionCard\n*L\n28#1:88,16\n*E\n"})
public class FunctionCard extends BaseCard {

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ KProperty<Object>[] f26185W = {Reflection.property1(new PropertyReference1Impl(FunctionCard.class, "kucoinLayoutHomeCardFunctionBinding", "getKucoinLayoutHomeCardFunctionBinding()Lcom/kubi/home/databinding/KucoinLayoutHomeCardFunctionBinding;", 0))};

    /* JADX INFO: renamed from: V */
    @NotNull
    public final InterfaceC24293a f26186V = C45681e.m100799e(this, new Function1<FunctionCard, C37544s0>() { // from class: com.kubi.home.recommend.FunctionCard$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37544s0 invoke(@NotNull FunctionCard fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37544s0.m84557a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37544s0, Unit>() { // from class: com.kubi.home.recommend.FunctionCard$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37544s0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37544s0 c37544s0) {
            invoke(c37544s0);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: com.kubi.home.recommend.FunctionCard$a */
    /* JADX INFO: compiled from: FunctionCard.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/home/recommend/FunctionCard$bindToUI$1$2", "Lcom/kubi/kucoin/home/cards/IExposureCallback;", TIMPushProvider.f75062n, "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14838a implements IExposureCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FunctionCardData.Data f26187a;

        public C14838a(FunctionCardData.Data data) {
            this.f26187a = data;
        }

        @Override // com.kubi.kucoin.home.cards.IExposureCallback
        public void show() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            FunctionCardData.Data data = this.f26187a;
            jSONObject.put("postId", data.getId());
            jSONObject.put("postTitle", data.getTitle());
            jSONObject.put("optionKey", MultiLanguageManager.f46811g.getLocalString());
            Integer order = data.getOrder();
            jSONObject.put("sortPosition", order != null ? order.toString() : null);
            Unit unit = Unit.INSTANCE;
            C43852m.m96593e(HomeCardViewHolderProxy.PAGE_ID, "recommendPosition", "1", jSONObject);
        }
    }

    /* JADX INFO: renamed from: g3 */
    public static final Unit m30200g3(FunctionCardData.Data data) throws JSONException {
        String string;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("postId", data.getId());
        jSONObject.put("postTitle", data.getTitle());
        jSONObject.put("optionKey", MultiLanguageManager.f46811g.getLocalString());
        Integer order = data.getOrder();
        jSONObject.put("sortPosition", order != null ? order.toString() : null);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a(HomeCardViewHolderProxy.PAGE_ID, "recommendPosition", "1", jSONObject);
        String link = data.getLink();
        if (link != null) {
            C4400a c4400aM56184f = Router.f46192a.m56184f(link);
            Integer order2 = data.getOrder();
            if (order2 == null || (string = order2.toString()) == null) {
                string = OtcAd.KYC_NOT_PASS;
            }
            c4400aM56184f.m4038a("spm", C43852m.m96601m(HomeCardViewHolderProxy.PAGE_ID, "recommendPosition", string)).m4048k();
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.kucoin.home.cards.ICard
    /* JADX INFO: renamed from: K1 */
    public void mo28980K1(@NotNull BaseCardData data) {
        final FunctionCardData.Data data2;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2;
        ImageView imageView;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        Intrinsics.checkNotNullParameter(data, "data");
        FunctionCardData functionCardData = data instanceof FunctionCardData ? (FunctionCardData) data : null;
        if (functionCardData == null || (data2 = functionCardData.getData()) == null) {
            return;
        }
        C37544s0 c37544s0M30201h3 = m30201h3();
        if (c37544s0M30201h3 != null && (baseTextView2 = c37544s0M30201h3.f83412e) != null) {
            baseTextView2.setText(data2.getTitle());
        }
        C37544s0 c37544s0M30201h4 = m30201h3();
        if (c37544s0M30201h4 != null && (baseTextView = c37544s0M30201h4.f83409b) != null) {
            baseTextView.setText(data2.getSummary());
        }
        C37544s0 c37544s0M30201h5 = m30201h3();
        if (c37544s0M30201h5 != null && (imageView = c37544s0M30201h5.f83410c) != null) {
            HomeRecommPosHelper.f25930a.m29739e(imageView, data2.getImageUrl(), getContext(), false);
        }
        C37544s0 c37544s0M30201h6 = m30201h3();
        if (c37544s0M30201h6 != null && (constraintLayout2 = c37544s0M30201h6.f83411d) != null) {
            C27046k.m66711z(constraintLayout2, 0L, new Function0() { // from class: com.kubi.home.recommend.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FunctionCard.m30200g3(data2);
                }
            }, 1, null);
        }
        C37544s0 c37544s0M30201h7 = m30201h3();
        if (c37544s0M30201h7 != null && (constraintLayout = c37544s0M30201h7.f83411d) != null) {
            ExtensionKt.m32178d(constraintLayout, new C14838a(data2), 0.0f, 0, 6, null);
        }
        C43841b.m96557d("event_load_home_recommend", "page_load_end", null, 4, null);
    }

    @Override // com.kubi.kucoin.home.cards.BaseCardFragment
    public int getLayout() {
        return R$layout.kucoin_layout_home_card_function;
    }

    /* JADX INFO: renamed from: h3 */
    public final C37544s0 m30201h3() {
        return (C37544s0) this.f26186V.getValue(this, f26185W[0]);
    }
}
