package com.kubi.otc.otc.paytype;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.firebase.messaging.Constants;
import com.kubi.otc.R$color;
import com.kubi.otc.R$mipmap;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p419l2.C42032f;
import p778xy.C46338a;
import p778xy.C46340c;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.otc.otc.paytype.f, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: PayTypeItem.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J5\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006 "}, m90084d2 = {"Lcom/kubi/otc/otc/paytype/PayTypeImageItem;", "Lcom/kubi/otc/otc/paytype/PayTypeItem;", Constants.ScionAnalytics.PARAM_LABEL, "", "url", "tag", "isRequired", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getLabel", "()Ljava/lang/String;", "getUrl", "getTag", "()Z", "title", "Landroid/widget/TextView;", "context", "Landroid/content/Context;", "image", "Landroid/widget/ImageView;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PayTypeImageItem implements PayTypeItem {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public final String label;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final String url;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final String tag;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final boolean isRequired;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayTypeImageItem)) {
            return false;
        }
        PayTypeImageItem payTypeImageItem = (PayTypeImageItem) other;
        return Intrinsics.areEqual(this.label, payTypeImageItem.label) && Intrinsics.areEqual(this.url, payTypeImageItem.url) && Intrinsics.areEqual(this.tag, payTypeImageItem.tag) && this.isRequired == payTypeImageItem.isRequired;
    }

    public PayTypeImageItem(@Nullable String str, @Nullable String str2, @NotNull String tag, boolean z11) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.label = str;
        this.url = str2;
        this.tag = tag;
        this.isRequired = z11;
    }

    @Override // com.kubi.otc.otc.paytype.PayTypeItem
    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getIsRequired() {
        return this.isRequired;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final ImageView m45242b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ImageView imageView = new ImageView(context);
        imageView.setTag(this);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setAdjustViewBounds(true);
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) C27025c.m66565c(context, 120), -2));
        if (TextUtils.isEmpty(this.url)) {
            imageView.setImageResource(R$mipmap.botc_ic_add_way);
            Unit unit = Unit.INSTANCE;
            return imageView;
        }
        C46340c<Drawable> c46340cMo6634v = C46338a.m102151a(context).mo6634v(this.url);
        C42032f c42032f = new C42032f();
        int i11 = R$mipmap.botc_ic_add_way;
        Intrinsics.checkNotNullExpressionValue(c46340cMo6634v.mo6606a(c42032f.mo92188b0(i11).mo92208m(i11)).m6594E0(imageView), "into(...)");
        return imageView;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final TextView m45243c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TextView textView = new TextView(context);
        textView.setTextSize(12.0f);
        textView.setText(C27041f.m66668h(this.label));
        textView.setTextColor(ContextCompat.getColor(context, R$color.emphasis60));
        return textView;
    }

    @Override // com.kubi.otc.otc.paytype.PayTypeItem
    @NotNull
    public String getTag() {
        return this.tag;
    }

    public int hashCode() {
        String str = this.label;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.tag.hashCode()) * 31) + Boolean.hashCode(this.isRequired);
    }

    @NotNull
    public String toString() {
        return "PayTypeImageItem(label=" + this.label + ", url=" + this.url + ", tag=" + this.tag + ", isRequired=" + this.isRequired + ')';
    }
}
