package gu;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.payment.p2p.data.entities.P2PMarketPaymentMethod;
import com.kubi.payment.p2p.trade.view.AbsP2PBaseTopPopup;
import com.kubi.payment.p2p.trade.view.PaymentMethodAdapter;
import com.kubi.resources.widget.ClearEditText;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: gu.r */
/* JADX INFO: compiled from: P2PPaymentMethodFilterPopup.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0014\u0010\u0018\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/payment/p2p/trade/view/P2PPaymentMethodFilterPopup;", "Lcom/kubi/payment/p2p/trade/view/AbsP2PBaseTopPopup;", "context", "Landroid/content/Context;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "", "", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "paymentMethodList", "", "Lcom/kubi/payment/p2p/data/entities/P2PMarketPaymentMethod;", "adapter", "Lcom/kubi/payment/p2p/trade/view/PaymentMethodAdapter;", "getAdapter", "()Lcom/kubi/payment/p2p/trade/view/PaymentMethodAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "getLayout", "", "initView", "viewHolder", "Lio/chad/library/adapter/base/BaseViewHolder;", "updateData", "paymentMethods", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nP2PPaymentMethodFilterPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 P2PPaymentMethodFilterPopup.kt\ncom/kubi/payment/p2p/trade/view/P2PPaymentMethodFilterPopup\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,67:1\n58#2,23:68\n93#2,3:91\n*S KotlinDebug\n*F\n+ 1 P2PPaymentMethodFilterPopup.kt\ncom/kubi/payment/p2p/trade/view/P2PPaymentMethodFilterPopup\n*L\n33#1:68,23\n33#1:91,3\n*E\n"})
public final class C38037r extends AbsP2PBaseTopPopup {

    /* JADX INFO: renamed from: g */
    @NotNull
    public final Context f85652g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final Function1<String, Unit> f85653h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final List<P2PMarketPaymentMethod> f85654i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final Lazy f85655j;

    /* JADX INFO: renamed from: gu.r$a */
    /* JADX INFO: compiled from: TextView.kt */
    @Metadata(m90083d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f¸\u0006\u0010"}, m90084d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", CmcdData.Factory.STREAMING_FORMAT_SS, "Landroid/text/Editable;", "beforeTextChanged", "text", "", "start", "", "count", TtmlNode.ANNOTATION_POSITION_AFTER, "onTextChanged", TtmlNode.ANNOTATION_POSITION_BEFORE, "core-ktx_release", "androidx/core/widget/TextViewKt$doAfterTextChanged$$inlined$addTextChangedListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 P2PPaymentMethodFilterPopup.kt\ncom/kubi/payment/p2p/trade/view/P2PPaymentMethodFilterPopup\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,97:1\n34#2,8:98\n71#3:106\n77#4:107\n*E\n"})
    public static final class a implements TextWatcher {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f85657c;

        public a(View view) {
            this.f85657c = view;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@Nullable Editable s11) {
            if (C38037r.this.m85914w().m49406j(StringsKt.trim((CharSequence) C27041f.m66668h(s11 != null ? s11.toString() : null)).toString())) {
                this.f85657c.setVisibility(8);
            } else {
                this.f85657c.setVisibility(0);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C38037r(@NotNull Context context, @NotNull Function1<? super String, Unit> callback) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f85652g = context;
        this.f85653h = callback;
        this.f85654i = new ArrayList();
        this.f85655j = LazyKt.lazy(new Function0() { // from class: gu.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C38037r.m85911v();
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public static final PaymentMethodAdapter m85911v() {
        return new PaymentMethodAdapter();
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m85913y(C38037r c38037r) {
        c38037r.f85653h.invoke(c38037r.m85914w().m49407k());
        c38037r.m49369i();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.payment.p2p.trade.view.AbsP2PBaseTopPopup
    /* JADX INFO: renamed from: m */
    public int mo49372m() {
        return R$layout.payment_p2p_filter_payment_method;
    }

    @Override // com.kubi.payment.p2p.trade.view.AbsP2PBaseTopPopup
    /* JADX INFO: renamed from: o */
    public void mo49374o(@NotNull BaseViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        View view = viewHolder.getView(R$id.tv_empty);
        final ClearEditText clearEditText = (ClearEditText) viewHolder.getView(R$id.search_view);
        Intrinsics.checkNotNull(clearEditText);
        clearEditText.addTextChangedListener(new a(view));
        RecyclerView recyclerView = (RecyclerView) viewHolder.getView(R$id.recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(this.f85652g, 2));
        recyclerView.setAdapter(m85914w());
        View view2 = viewHolder.getView(R$id.tv_reset);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: gu.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C38037r.m85912x(this.f85649b, clearEditText);
            }
        }, 1, null);
        View view3 = viewHolder.getView(R$id.tv_confirm);
        Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
        C27046k.m66711z(view3, 0L, new Function0() { // from class: gu.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C38037r.m85913y(this.f85651b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: w */
    public final PaymentMethodAdapter m85914w() {
        return (PaymentMethodAdapter) this.f85655j.getValue();
    }

    /* JADX INFO: renamed from: z */
    public final void m85915z(@NotNull List<P2PMarketPaymentMethod> paymentMethods) {
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        this.f85654i.clear();
        this.f85654i.addAll(paymentMethods);
        m85914w().m49410n(paymentMethods);
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m85912x(C38037r c38037r, ClearEditText clearEditText) {
        c38037r.m85914w().m49409m();
        clearEditText.setText("");
        return Unit.INSTANCE;
    }
}
