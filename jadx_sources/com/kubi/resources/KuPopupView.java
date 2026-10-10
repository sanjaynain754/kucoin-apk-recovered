package com.kubi.resources;

import android.content.Context;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$layout;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import qe0.C43724b;

/* JADX INFO: compiled from: KuPopupView.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m90083d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0007\b\u0016\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\f\u001a\u00020\u00002\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000f¢\u0006\u0002\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00002\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0012\u001a\u00020\u0013J&\u0010\u0014\u001a\u00020\u00002\u001e\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u0017\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00190\u00180\u0016J\u0016\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0017J\u0016\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fR\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006!"}, m90084d2 = {"Lcom/kubi/resources/KuPopupView;", "Lcom/zyyoona7/popup/EasyPopup;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "adapter", "com/kubi/resources/KuPopupView$adapter$2$1", "getAdapter", "()Lcom/kubi/resources/KuPopupView$adapter$2$1;", "adapter$delegate", "Lkotlin/Lazy;", "addData", "datas", "", "Lcom/kubi/resources/MenuItem;", "([Lcom/kubi/resources/MenuItem;)Lcom/kubi/resources/KuPopupView;", "replaceData", "clearData", "", "setOnItemClickListener", "consumer", "Lio/reactivex/functions/BiConsumer;", "", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lio/chad/library/adapter/base/BaseViewHolder;", "replaceIcon", "id", TUIConstants.TUIChat.INPUT_MORE_ICON, "replaceText", "text", "", "Companion", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKuPopupView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuPopupView.kt\ncom/kubi/resources/KuPopupView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n1869#2,2:103\n1869#2,2:105\n*S KotlinDebug\n*F\n+ 1 KuPopupView.kt\ncom/kubi/resources/KuPopupView\n*L\n74#1:103,2\n84#1:105,2\n*E\n"})
public class KuPopupView extends C43724b {

    /* JADX INFO: renamed from: E */
    @NotNull
    public static final Companion f43499E = new Companion(null);

    /* JADX INFO: renamed from: D */
    @NotNull
    public final Lazy f43500D;

    /* JADX INFO: compiled from: KuPopupView.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/resources/KuPopupView$Companion;", "", "<init>", "()V", "create", "Lcom/kubi/resources/KuPopupView;", "context", "Landroid/content/Context;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final KuPopupView create(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new KuPopupView(context);
        }
    }

    public KuPopupView(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43500D = LazyKt.lazy(new Function0() { // from class: com.kubi.resources.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KuPopupView.m54124l0();
            }
        });
        m96308R(context, R$layout.kucoin_simple_list_pop).m96316Z(true).m96306P(true).m96312V(0.4f).m96322p();
        RecyclerView recyclerView = (RecyclerView) m96292A().findViewById(R$id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(m96292A().getContext()));
        recyclerView.setAdapter(m54125m0());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.kubi.resources.KuPopupView$adapter$2$1] */
    /* JADX INFO: renamed from: l0 */
    public static final KuPopupView$adapter$2$1 m54124l0() {
        final int i11 = R$layout.kucoin_simple_list_text_v2;
        final ArrayList arrayList = new ArrayList();
        return new BaseQuickAdapter<MenuItem, BaseViewHolder>(i11, arrayList) { // from class: com.kubi.resources.KuPopupView$adapter$2$1
            @Override // io.chad.library.adapter.base.BaseQuickAdapter
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public void convert(BaseViewHolder helper, MenuItem item) {
                Intrinsics.checkNotNullParameter(helper, "helper");
                Intrinsics.checkNotNullParameter(item, "item");
                helper.setText(R$id.tv_label, item.getText());
                int i12 = R$id.iv_icon;
                helper.setImageResource(i12, item.getIcon());
                helper.setGone(i12, item.getIcon() != 0);
                Integer tint = item.getTint();
                if (tint != null) {
                    int iIntValue = tint.intValue();
                    ImageView imageView = (ImageView) helper.getView(i12);
                    Intrinsics.checkNotNull(imageView);
                    C27046k.m66701p(imageView, iIntValue);
                }
                helper.setGone(R$id.action_divider, helper.getAdapterPosition() != getData().size() - 1);
            }
        };
    }

    /* JADX INFO: renamed from: m0 */
    public final KuPopupView$adapter$2$1 m54125m0() {
        return (KuPopupView$adapter$2$1) this.f43500D.getValue();
    }
}
