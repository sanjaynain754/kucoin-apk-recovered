package com.sumsub.sns.core.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.C7090R;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sumsub.sns.core.theme.SNSColorElement;
import com.sumsub.sns.core.theme.SNSCustomizationTheme;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.theme.C28955c;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.ReplaceWith;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J)\u0010\b\u001a\u00020\u00012\u0010\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000b\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0002\u0010\u000eJ \u0010\u000f\u001a\u00020\u00012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00102\b\u0010\f\u001a\u0004\u0018\u00010\r¨\u0006\u0013"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder;", "Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "create", "Landroidx/appcompat/app/AlertDialog;", "setItems", FirebaseAnalytics.Param.ITEMS, "", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/content/DialogInterface$OnClickListener;", "([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;", "setStyledItems", "", "Companion", "Adapter", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSNSAlertDialogBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSAlertDialogBuilder.kt\ncom/sumsub/sns/core/widget/SNSAlertDialogBuilder\n+ 2 ThemeHelper.kt\ncom/sumsub/sns/core/presentation/helper/ThemeHelper\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n22#2:155\n1#3:156\n*S KotlinDebug\n*F\n+ 1 SNSAlertDialogBuilder.kt\ncom/sumsub/sns/core/widget/SNSAlertDialogBuilder\n*L\n54#1:155\n54#1:156\n*E\n"})
public final class SNSAlertDialogBuilder extends MaterialAlertDialogBuilder {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder$Adapter;", "Landroid/widget/ArrayAdapter;", "", "context", "Landroid/content/Context;", FirebaseAnalytics.Param.ITEMS, "", "textColor", "", "<init>", "(Landroid/content/Context;Ljava/util/List;Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "inflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "getView", "Landroid/view/View;", ViewProps.POSITION, "convertView", "parent", "Landroid/view/ViewGroup;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSNSAlertDialogBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSAlertDialogBuilder.kt\ncom/sumsub/sns/core/widget/SNSAlertDialogBuilder$Adapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1#2:155\n*E\n"})
    public static final class Adapter extends ArrayAdapter<CharSequence> {
        private final LayoutInflater inflater;

        @NotNull
        private final List<CharSequence> items;

        @Nullable
        private final Integer textColor;

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        @NotNull
        public View getView(int position, @Nullable View convertView, @NotNull ViewGroup parent) {
            if (convertView == null) {
                convertView = this.inflater.inflate(R.layout.simple_list_item_1, parent, false);
            }
            TextView textView = (TextView) convertView.findViewById(R.id.text1);
            textView.setText(this.items.get(position));
            Integer num = this.textColor;
            if (num != null) {
                textView.setTextColor(num.intValue());
            }
            return convertView;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Adapter(@NotNull Context context, @NotNull List<? extends CharSequence> list, @Nullable Integer num) {
            super(context, R.layout.simple_list_item_1, list);
            this.items = list;
            this.textColor = num;
            this.inflater = LayoutInflater.from(context);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\u0004\u001a\u00020\u0005*\u00020\u0007H\u0007¢\u0006\u0002\b\bJ\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\u0007H\u0002J\u000e\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\u0007H\u0002¨\u0006\r"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder$Companion;", "", "<init>", "()V", "showWithTheme", "", "dialog", "Landroidx/appcompat/app/AlertDialog;", "showWithThemeExtension", "setDialogColors", "getMessageTextView", "Landroid/widget/TextView;", "getTitleTextView", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nSNSAlertDialogBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSAlertDialogBuilder.kt\ncom/sumsub/sns/core/widget/SNSAlertDialogBuilder$Companion\n+ 2 ThemeHelper.kt\ncom/sumsub/sns/core/presentation/helper/ThemeHelper\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n22#2:155\n1#3:156\n1#3:157\n*S KotlinDebug\n*F\n+ 1 SNSAlertDialogBuilder.kt\ncom/sumsub/sns/core/widget/SNSAlertDialogBuilder$Companion\n*L\n110#1:155\n110#1:156\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final TextView getMessageTextView(AlertDialog alertDialog) {
            Object objM103844constructorimpl;
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl((TextView) alertDialog.findViewById(R.id.message));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                objM103844constructorimpl = null;
            }
            return (TextView) objM103844constructorimpl;
        }

        private final TextView getTitleTextView(AlertDialog alertDialog) {
            Object objM103844constructorimpl;
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl((TextView) alertDialog.findViewById(C7090R.id.alertTitle));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                objM103844constructorimpl = null;
            }
            return (TextView) objM103844constructorimpl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setDialogColors(AlertDialog dialog) {
            Integer num;
            C28955c c28955c;
            C28955c c28955c2;
            SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
            Integer num2 = null;
            SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
            C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
            if (c28966p != null) {
                boolean zM69346a = AbstractC28458h.m69346a(dialog.getContext().getResources().getConfiguration());
                SNSColorElement sNSColorElement = SNSColorElement.ALERT_TINT;
                Map map = c28966p.f58877c;
                if (map == null || (c28955c2 = (C28955c) map.get(sNSColorElement.getValue())) == null) {
                    num = null;
                } else {
                    num = zM69346a ? c28955c2.f58858a : c28955c2.f58859b;
                }
                if (num != null) {
                    int iIntValue = num.intValue();
                    Button button = dialog.getButton(-1);
                    if (button != null) {
                        button.setTextColor(iIntValue);
                    }
                    Button button2 = dialog.getButton(-2);
                    if (button2 != null) {
                        button2.setTextColor(iIntValue);
                    }
                    Button button3 = dialog.getButton(-3);
                    if (button3 != null) {
                        button3.setTextColor(iIntValue);
                    }
                }
                SNSColorElement sNSColorElement2 = SNSColorElement.CONTENT_STRONG;
                Map map2 = c28966p.f58877c;
                if (map2 != null && (c28955c = (C28955c) map2.get(sNSColorElement2.getValue())) != null) {
                    num2 = zM69346a ? c28955c.f58858a : c28955c.f58859b;
                }
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    Companion companion = SNSAlertDialogBuilder.INSTANCE;
                    TextView titleTextView = companion.getTitleTextView(dialog);
                    if (titleTextView != null) {
                        titleTextView.setTextColor(iIntValue2);
                    }
                    TextView messageTextView = companion.getMessageTextView(dialog);
                    if (messageTextView != null) {
                        messageTextView.setTextColor(iIntValue2);
                    }
                }
            }
        }

        public final void showWithTheme(@NotNull AlertDialog dialog) {
            dialog.show();
            setDialogColors(dialog);
        }

        @JvmName(name = "showWithThemeExtension")
        public final void showWithThemeExtension(@NotNull AlertDialog alertDialog) {
            showWithTheme(alertDialog);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void create$lambda$3$lambda$2(AlertDialog alertDialog, DialogInterface dialogInterface) {
        INSTANCE.setDialogColors(alertDialog);
    }

    @Override // com.google.android.material.dialog.MaterialAlertDialogBuilder, androidx.appcompat.app.AlertDialog.Builder
    @NotNull
    public AlertDialog create() {
        C28955c c28955c;
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        Integer num = null;
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            SNSColorElement sNSColorElement = SNSColorElement.BACKGROUND_COMMON;
            boolean zM69346a = AbstractC28458h.m69346a(getContext().getResources().getConfiguration());
            Map map = c28966p.f58877c;
            if (map != null && (c28955c = (C28955c) map.get(sNSColorElement.getValue())) != null) {
                num = zM69346a ? c28955c.f58858a : c28955c.f58859b;
            }
            if (num != null) {
                int iIntValue = num.intValue();
                Drawable background = getBackground();
                if (background != null) {
                    background.setTintMode(PorterDuff.Mode.SRC_ATOP);
                }
                Drawable background2 = getBackground();
                if (background2 != null) {
                    background2.setTint(iIntValue);
                }
            }
        }
        final AlertDialog alertDialogCreate = super.create();
        alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.sumsub.sns.core.widget.b
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                SNSAlertDialogBuilder.create$lambda$3$lambda$2(alertDialogCreate, dialogInterface);
            }
        });
        return alertDialogCreate;
    }

    @Override // com.google.android.material.dialog.MaterialAlertDialogBuilder, androidx.appcompat.app.AlertDialog.Builder
    @Deprecated(message = "Use setStyledItems to use list items color customization", replaceWith = @ReplaceWith(expression = "this.setStyledItems(items, listener)", imports = {}))
    @NotNull
    public MaterialAlertDialogBuilder setItems(@Nullable CharSequence[] items, @Nullable DialogInterface.OnClickListener listener) {
        return super.setItems(items, listener);
    }

    @NotNull
    public final MaterialAlertDialogBuilder setStyledItems(@NotNull List<? extends CharSequence> items, @Nullable DialogInterface.OnClickListener listener) {
        C28955c c28955c;
        SNSJsonCustomization customization = C28468k0.f57983a.getCustomization();
        Integer num = null;
        SNSCustomizationTheme theme = customization != null ? customization.getTheme() : null;
        C28966p c28966p = theme instanceof C28966p ? (C28966p) theme : null;
        if (c28966p != null) {
            SNSColorElement sNSColorElement = SNSColorElement.CONTENT_STRONG;
            boolean zM69346a = AbstractC28458h.m69346a(getContext().getResources().getConfiguration());
            Map map = c28966p.f58877c;
            if (map != null && (c28955c = (C28955c) map.get(sNSColorElement.getValue())) != null) {
                num = zM69346a ? c28955c.f58858a : c28955c.f58859b;
            }
        }
        return setAdapter((ListAdapter) new Adapter(getContext(), items, num), listener);
    }

    public SNSAlertDialogBuilder(@NotNull Context context) {
        super(context);
    }
}
