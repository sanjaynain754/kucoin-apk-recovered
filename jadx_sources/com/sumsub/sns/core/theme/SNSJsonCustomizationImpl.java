package com.sumsub.sns.core.theme;

import android.content.Context;
import com.kubi.sdk.BaseActivity;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.internal.core.presentation.theme.C28966p;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"Lcom/sumsub/sns/core/theme/SNSJsonCustomizationImpl;", "Lcom/sumsub/sns/core/theme/SNSJsonCustomization;", "<init>", "()V", "Lcom/sumsub/sns/core/theme/SNSTheme;", BaseActivity.THEME, "", "loadTheme", "(Lcom/sumsub/sns/core/theme/SNSTheme;)V", "Landroid/content/Context;", "context", "loadResources", "(Landroid/content/Context;)V", "Lcom/sumsub/sns/internal/core/presentation/theme/p;", "getTheme", "()Lcom/sumsub/sns/internal/core/presentation/theme/p;", "Lcom/sumsub/sns/internal/core/presentation/theme/p;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class SNSJsonCustomizationImpl implements SNSJsonCustomization {

    @Nullable
    private C28966p theme;

    @Override // com.sumsub.sns.core.theme.SNSJsonCustomization
    @Nullable
    public C28966p getTheme() {
        return this.theme;
    }

    @Override // com.sumsub.sns.core.theme.SNSJsonCustomization
    public void loadResources(@NotNull Context context) {
        C28966p c28966p = this.theme;
        if (c28966p != null) {
            c28966p.m69709a(context);
        }
    }

    @Override // com.sumsub.sns.core.theme.SNSJsonCustomization
    public void loadTheme(@NotNull SNSTheme theme) {
        Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(this), "Loading native theme", null, 4, null);
        C28966p c28966p = new C28966p(SNSCustomizationFileFormat.NATIVE);
        C28966p.m69706a(c28966p, theme);
        this.theme = c28966p;
    }
}
