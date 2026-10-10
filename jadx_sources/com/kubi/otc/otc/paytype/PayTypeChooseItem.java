package com.kubi.otc.otc.paytype;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.C5275i0;
import com.google.firebase.messaging.Constants;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.resources.widget.FilterEmojiEditText;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.otc.otc.paytype.b, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: PayTypeItem.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001aJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003JS\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010$\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000e\"\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0016¨\u0006*"}, m90084d2 = {"Lcom/kubi/otc/otc/paytype/PayTypeChooseItem;", "Lcom/kubi/otc/otc/paytype/PayTypeItem;", Constants.ScionAnalytics.PARAM_LABEL, "", "hint", "content", "options", "", "tag", "isRequired", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V", "getLabel", "()Ljava/lang/String;", "getHint", "getContent", "setContent", "(Ljava/lang/String;)V", "getOptions", "()Ljava/util/List;", "getTag", "()Z", "title", "Landroid/widget/TextView;", "context", "Landroid/content/Context;", "chooser", "Lcom/kubi/resources/widget/FilterEmojiEditText;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PayTypeChooseItem implements PayTypeItem {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public final String label;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final String hint;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public String content;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final List<String> options;

    /* JADX INFO: renamed from: e, reason: from toString */
    @NotNull
    public final String tag;

    /* JADX INFO: renamed from: f, reason: from toString */
    public final boolean isRequired;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayTypeChooseItem)) {
            return false;
        }
        PayTypeChooseItem payTypeChooseItem = (PayTypeChooseItem) other;
        return Intrinsics.areEqual(this.label, payTypeChooseItem.label) && Intrinsics.areEqual(this.hint, payTypeChooseItem.hint) && Intrinsics.areEqual(this.content, payTypeChooseItem.content) && Intrinsics.areEqual(this.options, payTypeChooseItem.options) && Intrinsics.areEqual(this.tag, payTypeChooseItem.tag) && this.isRequired == payTypeChooseItem.isRequired;
    }

    public PayTypeChooseItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<String> list, @NotNull String tag, boolean z11) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.label = str;
        this.hint = str2;
        this.content = str3;
        this.options = list;
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
    public final FilterEmojiEditText m45232b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FilterEmojiEditText filterEmojiEditText = new FilterEmojiEditText(context);
        filterEmojiEditText.setTag(this);
        filterEmojiEditText.setFocusable(false);
        filterEmojiEditText.setTextSize(16.0f);
        filterEmojiEditText.setGravity(16);
        filterEmojiEditText.setBackground(ContextCompat.getDrawable(context, R$drawable.shape_edittext_border_background_with_error));
        filterEmojiEditText.setPadding(C5275i0.m6236a(8.0f), C5275i0.m6236a(8.0f), C5275i0.m6236a(8.0f), C5275i0.m6236a(8.0f));
        filterEmojiEditText.setHint(C27041f.m66668h(this.hint));
        filterEmojiEditText.setText(C27041f.m66668h(this.content));
        filterEmojiEditText.setTextColor(ContextCompat.getColor(context, R$color.c_text));
        filterEmojiEditText.setHintTextColor(ContextCompat.getColor(context, R$color.c_text20));
        filterEmojiEditText.setLayoutParams(new ViewGroup.LayoutParams(-1, C5275i0.m6236a(48.0f)));
        C27046k.m66694i(filterEmojiEditText, R$drawable.icon_arrow_right_mirrored, C5275i0.m6236a(10.0f), 0, 4, null);
        return filterEmojiEditText;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final List<String> m45233c() {
        return this.options;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final TextView m45234d(@NotNull Context context) {
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
        String str2 = this.hint;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.content;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.options;
        return ((((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31) + this.tag.hashCode()) * 31) + Boolean.hashCode(this.isRequired);
    }

    @NotNull
    public String toString() {
        return "PayTypeChooseItem(label=" + this.label + ", hint=" + this.hint + ", content=" + this.content + ", options=" + this.options + ", tag=" + this.tag + ", isRequired=" + this.isRequired + ')';
    }
}
