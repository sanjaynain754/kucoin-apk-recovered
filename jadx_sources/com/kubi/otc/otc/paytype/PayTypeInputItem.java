package com.kubi.otc.otc.paytype;

import android.content.Context;
import android.text.InputFilter;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.autofill.HintConstants;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.C5275i0;
import com.google.firebase.messaging.Constants;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.FilterEmojiEditText;
import com.kubi.utils.extensions.C27041f;
import com.tencent.cloud.tuikit.engine.common.internal.TUIConstantDefine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.otc.otc.paytype.g, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: PayTypeItem.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003JA\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\f\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0012¨\u0006%"}, m90084d2 = {"Lcom/kubi/otc/otc/paytype/PayTypeInputItem;", "Lcom/kubi/otc/otc/paytype/PayTypeItem;", Constants.ScionAnalytics.PARAM_LABEL, "", "hint", "content", "tag", "isRequired", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getLabel", "()Ljava/lang/String;", "getHint", "getContent", "setContent", "(Ljava/lang/String;)V", "getTag", "()Z", "title", "Landroid/widget/TextView;", "context", "Landroid/content/Context;", "input", "Lcom/kubi/resources/widget/FilterEmojiEditText;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PayTypeInputItem implements PayTypeItem {

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
    @NotNull
    public final String tag;

    /* JADX INFO: renamed from: e, reason: from toString */
    public final boolean isRequired;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayTypeInputItem)) {
            return false;
        }
        PayTypeInputItem payTypeInputItem = (PayTypeInputItem) other;
        return Intrinsics.areEqual(this.label, payTypeInputItem.label) && Intrinsics.areEqual(this.hint, payTypeInputItem.hint) && Intrinsics.areEqual(this.content, payTypeInputItem.content) && Intrinsics.areEqual(this.tag, payTypeInputItem.tag) && this.isRequired == payTypeInputItem.isRequired;
    }

    public PayTypeInputItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String tag, boolean z11) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.label = str;
        this.hint = str2;
        this.content = str3;
        this.tag = tag;
        this.isRequired = z11;
    }

    @Override // com.kubi.otc.otc.paytype.PayTypeItem
    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getIsRequired() {
        return this.isRequired;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0043  */
    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    /* JADX INFO: renamed from: c */
    public final FilterEmojiEditText m45245c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FilterEmojiEditText filterEmojiEditText = new FilterEmojiEditText(context);
        filterEmojiEditText.setTag(this);
        filterEmojiEditText.setTextSize(16.0f);
        filterEmojiEditText.setGravity(16);
        filterEmojiEditText.setMaxLines(1);
        filterEmojiEditText.setSingleLine(true);
        String tag = getTag();
        int i11 = 256;
        switch (tag.hashCode()) {
            case -1859291417:
                if (!tag.equals("bankName")) {
                    i11 = Integer.MAX_VALUE;
                } else {
                    i11 = 64;
                }
                break;
            case -1663380740:
                if (!tag.equals("transitNumber")) {
                    i11 = Integer.MAX_VALUE;
                } else {
                    i11 = 64;
                }
                break;
            case -1119658517:
                if (!tag.equals("payTypeNumber")) {
                    i11 = Integer.MAX_VALUE;
                } else {
                    i11 = 60;
                }
                break;
            case -874635262:
                if (!tag.equals("subBranch")) {
                    i11 = Integer.MAX_VALUE;
                } else {
                    i11 = 64;
                }
                break;
            case -826936808:
                if (!tag.equals("bankAddress")) {
                    i11 = Integer.MAX_VALUE;
                }
                break;
            case -405650655:
                if (!tag.equals("institutionNumber")) {
                    i11 = Integer.MAX_VALUE;
                } else {
                    i11 = 32;
                }
                break;
            case -266666762:
                if (!tag.equals(TUIConstantDefine.USER_NAME)) {
                    i11 = Integer.MAX_VALUE;
                } else {
                    i11 = 64;
                }
                break;
            case 106642798:
                if (!tag.equals(HintConstants.AUTOFILL_HINT_PHONE)) {
                    i11 = Integer.MAX_VALUE;
                } else {
                    i11 = 32;
                }
                break;
            case 683273020:
                if (!tag.equals("swiftNumber")) {
                    i11 = Integer.MAX_VALUE;
                } else {
                    i11 = 32;
                }
                break;
            case 1286326089:
                if (!tag.equals("payeesAddress")) {
                    i11 = Integer.MAX_VALUE;
                }
                break;
            default:
                i11 = Integer.MAX_VALUE;
                break;
        }
        filterEmojiEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i11)});
        filterEmojiEditText.setBackground(ContextCompat.getDrawable(context, R$drawable.shape_edittext_border_background_with_error));
        filterEmojiEditText.setHint(C27041f.m66668h(this.hint));
        filterEmojiEditText.setText(C27041f.m66668h(this.content));
        filterEmojiEditText.setPadding(C5275i0.m6236a(8.0f), C5275i0.m6236a(8.0f), C5275i0.m6236a(8.0f), C5275i0.m6236a(8.0f));
        filterEmojiEditText.setTextColor(ContextCompat.getColor(context, R$color.emphasis));
        filterEmojiEditText.setHintTextColor(ContextCompat.getColor(context, R$color.c_text20));
        filterEmojiEditText.setLayoutParams(new ViewGroup.LayoutParams(-1, C5275i0.m6236a(48.0f)));
        C22912t.m54419q(filterEmojiEditText, R$drawable.shape_primary_cursor);
        return filterEmojiEditText;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final TextView m45246d(@NotNull Context context) {
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
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.tag.hashCode()) * 31) + Boolean.hashCode(this.isRequired);
    }

    @NotNull
    public String toString() {
        return "PayTypeInputItem(label=" + this.label + ", hint=" + this.hint + ", content=" + this.content + ", tag=" + this.tag + ", isRequired=" + this.isRequired + ')';
    }
}
