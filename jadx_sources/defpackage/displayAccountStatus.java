package defpackage;

import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$string;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: c, reason: from Kotlin metadata */
/* JADX INFO: compiled from: WithdrawAccountStatusExt.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, m90084d2 = {"displayAccountStatus", "", "Landroid/widget/TextView;", "status", "", "PaymentLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class displayAccountStatus {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public static final void m4788a(@NotNull TextView textView, @Nullable String str) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (str != null) {
            switch (str.hashCode()) {
                case 2283824:
                    if (str.equals("Init")) {
                        textView.setText(textView.getContext().getString(R$string.payment_account_status_unverified));
                        textView.setTextColor(ContextCompat.getColor(textView.getContext(), R$color.complementary));
                        textView.setBackgroundResource(R$drawable.shape_complementary8_4r);
                        C27046k.m66685H(textView);
                        return;
                    }
                    break;
                case 308097193:
                    if (str.equals("Verifying")) {
                        textView.setText(textView.getContext().getString(R$string.payment_account_status_verify));
                        textView.setTextColor(ContextCompat.getColor(textView.getContext(), R$color.complementary));
                        textView.setBackgroundResource(R$drawable.shape_complementary8_4r);
                        C27046k.m66685H(textView);
                        return;
                    }
                    break;
                case 1955883814:
                    if (str.equals("Active")) {
                        textView.setText(textView.getContext().getString(R$string.payment_account_status_verified));
                        textView.setTextColor(ContextCompat.getColor(textView.getContext(), R$color.brandGreen));
                        textView.setBackgroundResource(R$drawable.shape_primary8_4r);
                        C27046k.m66685H(textView);
                        return;
                    }
                    break;
                case 2021313932:
                    if (str.equals("Closed")) {
                        textView.setText(textView.getContext().getString(R$string.payment_account_status_closed));
                        textView.setTextColor(ContextCompat.getColor(textView.getContext(), R$color.c_text40));
                        textView.setBackgroundResource(R$drawable.shape_cover4_4r);
                        C27046k.m66685H(textView);
                        return;
                    }
                    break;
                case 2096857181:
                    if (str.equals("Failed")) {
                        textView.setText(textView.getContext().getString(R$string.payment_account_status_failed));
                        textView.setTextColor(ContextCompat.getColor(textView.getContext(), R$color.brandRed));
                        textView.setBackgroundResource(R$drawable.shape_secondary8_4r);
                        C27046k.m66685H(textView);
                        return;
                    }
                    break;
            }
        }
        textView.setText("");
        C27046k.m66700o(textView);
    }
}
