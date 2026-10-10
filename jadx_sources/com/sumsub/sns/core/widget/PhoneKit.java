package com.sumsub.sns.core.widget;

import com.sumsub.sns.core.widget.autocompletePhone.ValidationListener;
import com.sumsub.sns.internal.features.data.model.common.remote.C29405l0;
import com.sumsub.sns.internal.features.presentation.country.C30877b;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001BW\u0012\"\u0010\u0007\u001a\u001e\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\b\u0012\u00060\u0003j\u0002`\u0005\u0018\u00010\u0002j\u0004\u0018\u0001`\u0006\u0012\u001e\u0010\n\u001a\u001a\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u0002j\u0004\u0018\u0001`\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR6\u0010\u0007\u001a\u001e\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\b\u0012\u00060\u0003j\u0002`\u0005\u0018\u00010\u0002j\u0004\u0018\u0001`\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R2\u0010\n\u001a\u001a\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u0002j\u0004\u0018\u0001`\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m90084d2 = {"Lcom/sumsub/sns/core/widget/PhoneKit;", "", "", "", "Lcom/sumsub/sns/internal/features/data/model/common/CountryCode;", "Lcom/sumsub/sns/internal/features/data/model/common/CountryName;", "Lcom/sumsub/sns/internal/features/data/model/common/CountryCodeToNameMap;", "countries", "Lcom/sumsub/sns/internal/features/data/model/common/remote/l0;", "Lcom/sumsub/sns/internal/features/data/model/common/PhoneCountryCodeWithMasks;", "phoneMasks", "Lcom/sumsub/sns/core/widget/autocompletePhone/ValidationListener;", "validListener", "<init>", "(Ljava/util/Map;Ljava/util/Map;Lcom/sumsub/sns/core/widget/autocompletePhone/ValidationListener;)V", "Ljava/util/Map;", "getCountries", "()Ljava/util/Map;", "getPhoneMasks", "Lcom/sumsub/sns/core/widget/autocompletePhone/ValidationListener;", "getValidListener", "()Lcom/sumsub/sns/core/widget/autocompletePhone/ValidationListener;", "", "isValid", "()Z", "Lcom/sumsub/sns/internal/features/presentation/country/b;", "getCountry", "()Lcom/sumsub/sns/internal/features/presentation/country/b;", "country", "getMask", "()Lcom/sumsub/sns/internal/features/data/model/common/remote/l0;", "mask", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public abstract class PhoneKit {

    @Nullable
    private final Map<String, String> countries;

    @Nullable
    private final Map<String, C29405l0> phoneMasks;

    @Nullable
    private final ValidationListener validListener;

    @Nullable
    public abstract C30877b getCountry();

    @Nullable
    public abstract C29405l0 getMask();

    public abstract boolean isValid();

    @Nullable
    public final Map<String, C29405l0> getPhoneMasks() {
        return this.phoneMasks;
    }

    public PhoneKit(@Nullable Map<String, String> map, @Nullable Map<String, C29405l0> map2, @Nullable ValidationListener validationListener) {
        this.countries = map;
        this.phoneMasks = map2;
        this.validListener = validationListener;
    }
}
