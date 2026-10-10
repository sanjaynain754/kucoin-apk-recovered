package com.sumsub.sns.core.widget.autocompletePhone;

import com.sumsub.sns.core.widget.PhoneKit;
import com.sumsub.sns.core.widget.SNSFlaggedInputLayout;
import com.sumsub.sns.internal.features.data.model.common.remote.C29405l0;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001as\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\"\u0010\u0007\u001a\u001e\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\b\u0012\u00060\u0003j\u0002`\u0005\u0018\u00010\u0002j\u0004\u0018\u0001`\u00062\u001e\u0010\n\u001a\u001a\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u0002j\u0004\u0018\u0001`\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m90084d2 = {"Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;", "input", "", "", "Lcom/sumsub/sns/internal/features/data/model/common/CountryCode;", "Lcom/sumsub/sns/internal/features/data/model/common/CountryName;", "Lcom/sumsub/sns/internal/features/data/model/common/CountryCodeToNameMap;", "countries", "Lcom/sumsub/sns/internal/features/data/model/common/remote/l0;", "Lcom/sumsub/sns/internal/features/data/model/common/PhoneCountryCodeWithMasks;", "phoneMasks", "Lcom/sumsub/sns/core/widget/autocompletePhone/ValidationListener;", "validationListener", "", "initialValue", "Lcom/sumsub/sns/core/widget/PhoneKit;", "getPhoneKit", "(Lcom/sumsub/sns/core/widget/SNSFlaggedInputLayout;Ljava/util/Map;Ljava/util/Map;Lcom/sumsub/sns/core/widget/autocompletePhone/ValidationListener;Ljava/lang/CharSequence;)Lcom/sumsub/sns/core/widget/PhoneKit;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 2, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class PhoneKitProviderKt {
    @NotNull
    public static final PhoneKit getPhoneKit(@Nullable SNSFlaggedInputLayout sNSFlaggedInputLayout, @Nullable Map<String, String> map, @Nullable Map<String, C29405l0> map2, @Nullable ValidationListener validationListener, @Nullable CharSequence charSequence) {
        return new PhoneNumberKitV2(sNSFlaggedInputLayout, map, map2, validationListener, charSequence);
    }

    public static /* synthetic */ PhoneKit getPhoneKit$default(SNSFlaggedInputLayout sNSFlaggedInputLayout, Map map, Map map2, ValidationListener validationListener, CharSequence charSequence, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            validationListener = null;
        }
        if ((i11 & 16) != 0) {
            charSequence = null;
        }
        return getPhoneKit(sNSFlaggedInputLayout, map, map2, validationListener, charSequence);
    }
}
