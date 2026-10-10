package com.kubi.sdk.site.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteExtConfigKey;
import com.kubi.sdk.site.config.R$styleable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SiteLogoImageView.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/sdk/site/widget/SiteLogoImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "load", "", "logoConfigKey", "Lcom/kubi/sdk/site/SiteExtConfigKey;", "int2SiteExtConfigKey", "siteIndex", "", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SiteLogoImageView extends AppCompatImageView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SiteLogoImageView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R$styleable.SiteLogoImageView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int i11 = typedArrayObtainStyledAttributes.getInt(R$styleable.SiteLogoImageView_siteLogo, 0);
        typedArrayObtainStyledAttributes.recycle();
        m58200b(m58199a(i11));
    }

    /* JADX INFO: renamed from: b */
    public final void m58200b(@NotNull SiteExtConfigKey logoConfigKey) {
        Intrinsics.checkNotNullParameter(logoConfigKey, "logoConfigKey");
        setImageResource(logoConfigKey.getPlaceholder());
        String strM58032d = C24129b.m58032d(logoConfigKey);
        if (TextUtils.isEmpty(strM58032d)) {
            return;
        }
        ComponentCallbacks2C5309c.m6557u(this).mo6634v(strM58032d).mo92188b0(logoConfigKey.getPlaceholder()).m6594E0(this);
    }

    /* JADX INFO: renamed from: a */
    public final SiteExtConfigKey m58199a(int i11) {
        switch (i11) {
            case 0:
                return SiteExtConfigKey.LogoGeneralGreenPng;
            case 1:
                return SiteExtConfigKey.LogoGeneralWhitePng;
            case 2:
                return SiteExtConfigKey.LogoGeneralGrayPng;
            case 3:
                return SiteExtConfigKey.LogoGeneralBlackPng;
            case 4:
                return SiteExtConfigKey.LogoSmallPng;
            case 5:
                return SiteExtConfigKey.LogoBigGreenPng;
            case 6:
                return SiteExtConfigKey.LogoBigGrayPng;
            case 7:
                return SiteExtConfigKey.LogoFuturePng;
            case 8:
                return SiteExtConfigKey.LogoCollegePng;
            case 9:
                return SiteExtConfigKey.LogoOrganWhitePng;
            case 10:
                return SiteExtConfigKey.LogoOrganBlackPng;
            default:
                return SiteExtConfigKey.LogoGeneralGreenPng;
        }
    }
}
