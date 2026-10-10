package ld0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.trtc.uikit.livekit.R$color;
import com.trtc.uikit.livekit.R$id;
import com.trtc.uikit.livekit.R$layout;
import io.trtc.tuikit.atomicxcore.api.gift.GiftCategory;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: ld0.d */
/* JADX INFO: compiled from: GiftCategoryTabManager.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0007J\u0014\u0010\u0013\u001a\u00020\u00142\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\tH\u0002J\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/GiftCategoryTabManager;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "onCategorySelectedListener", "Lcom/trtc/uikit/livekit/component/gift/view/GiftCategoryTabManager$OnCategorySelectedListener;", "currentSelectedIndex", "", "tabViews", "", "Landroid/widget/TextView;", "categories", "", "Lio/trtc/tuikit/atomicxcore/api/gift/GiftCategory;", "setOnCategorySelectedListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "createTabLayout", "Landroid/view/View;", "createTabView", "title", "", "index", "selectTab", "OnCategorySelectedListener", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nGiftCategoryTabManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftCategoryTabManager.kt\ncom/trtc/uikit/livekit/component/gift/view/GiftCategoryTabManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,77:1\n1878#2,3:78\n1878#2,3:81\n*S KotlinDebug\n*F\n+ 1 GiftCategoryTabManager.kt\ncom/trtc/uikit/livekit/component/gift/view/GiftCategoryTabManager\n*L\n33#1:78,3\n66#1:81,3\n*E\n"})
public final class C42174d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Context f93626a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public a f93627b;

    /* JADX INFO: renamed from: c */
    public int f93628c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final List<TextView> f93629d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public List<GiftCategory> f93630e;

    /* JADX INFO: renamed from: ld0.d$a */
    /* JADX INFO: compiled from: GiftCategoryTabManager.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/gift/view/GiftCategoryTabManager$OnCategorySelectedListener;", "", "onCategorySelected", "", "categoryIndex", "", "category", "Lio/trtc/tuikit/atomicxcore/api/gift/GiftCategory;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo92602a(int i11, @Nullable GiftCategory giftCategory);
    }

    public C42174d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f93626a = context;
        this.f93629d = new ArrayList();
        this.f93630e = CollectionsKt.emptyList();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final View m92599b(@NotNull List<GiftCategory> categories) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.f93630e = categories;
        View viewInflate = LayoutInflater.from(this.f93626a).inflate(R$layout.gift_layout_tab_layout, (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R$id.ll_tab_container);
        int i11 = 0;
        for (Object obj : categories) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            TextView textViewM92600c = m92600c(((GiftCategory) obj).getName(), i11);
            linearLayout.addView(textViewM92600c);
            this.f93629d.add(textViewM92600c);
            i11 = i12;
        }
        m92601e(0);
        Intrinsics.checkNotNull(viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public final TextView m92600c(String str, final int i11) {
        View viewInflate = LayoutInflater.from(this.f93626a).inflate(R$layout.gift_layout_tab_item, (ViewGroup) null);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewInflate;
        textView.setText(str);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setOnClickListener(new View.OnClickListener() { // from class: ld0.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C42174d.m92598d(this.f93624b, i11, view);
            }
        });
        return textView;
    }

    /* JADX INFO: renamed from: e */
    public final void m92601e(int i11) {
        int i12 = 0;
        for (Object obj : this.f93629d) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            TextView textView = (TextView) obj;
            if (i12 == i11) {
                textView.setTextColor(ContextCompat.getColor(this.f93626a, R$color.common_color_white_e5));
                textView.setSelected(true);
            } else {
                textView.setTextColor(ContextCompat.getColor(this.f93626a, R$color.common_text_color_secondary));
                textView.setSelected(false);
            }
            i12 = i13;
        }
        this.f93628c = i11;
    }

    public final void setOnCategorySelectedListener(@NotNull a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f93627b = listener;
    }

    /* JADX INFO: renamed from: d */
    public static final void m92598d(C42174d c42174d, int i11, View view) {
        c42174d.m92601e(i11);
        GiftCategory giftCategory = (GiftCategory) CollectionsKt.getOrNull(c42174d.f93630e, i11);
        a aVar = c42174d.f93627b;
        if (aVar != null) {
            aVar.mo92602a(i11, giftCategory);
        }
    }
}
