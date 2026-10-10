package com.jumio.core;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.AttrRes;
import androidx.annotation.StyleRes;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.jumio.commons.log.Log;
import com.jumio.core.models.AuthorizationModel;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import jumio.core.InterfaceC40542I0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJN\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002H\u00130\u0012\"\u0004\b\u0000\u0010\u00132\b\b\u0001\u0010\u0014\u001a\u00020\b2\b\b\u0001\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u0002H\u00130\u0019R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u00060\u000eR\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m90084d2 = {"Lcom/jumio/core/MobileContext;", "Landroid/content/ContextWrapper;", "Lcom/jumio/core/persistence/DataAccessEncryption;", TtmlNode.RUBY_BASE, "Landroid/content/Context;", "authorizationModel", "Lcom/jumio/core/models/AuthorizationModel;", "customThemeId", "", "<init>", "(Landroid/content/Context;Lcom/jumio/core/models/AuthorizationModel;I)V", "getCustomThemeId", "()I", "sessionKey", "Lcom/jumio/core/models/AuthorizationModel$SessionKey;", "getSessionKey", "()Lcom/jumio/core/models/AuthorizationModel$SessionKey;", "getCustomizations", "", ExifInterface.GPS_DIRECTION_TRUE, "defaultStyle", "customizedStyle", JAnalysisConstants.EVENT_ATTRIBUTES, "", "getValue", "Lkotlin/Function2;", "Landroid/content/res/TypedArray;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MobileContext extends ContextWrapper implements InterfaceC40542I0 {

    /* JADX INFO: renamed from: a */
    public final AuthorizationModel f13623a;

    /* JADX INFO: renamed from: b */
    public final int f13624b;

    public /* synthetic */ MobileContext(Context context, AuthorizationModel authorizationModel, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, authorizationModel, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileContext(@Nullable Context context, @NotNull AuthorizationModel authorizationModel, int i11) {
        super(context);
        Intrinsics.checkNotNullParameter(authorizationModel, "authorizationModel");
        this.f13623a = authorizationModel;
        this.f13624b = i11;
    }

    /* JADX INFO: renamed from: getCustomThemeId, reason: from getter */
    public final int getF13624b() {
        return this.f13624b;
    }

    @NotNull
    public final <T> Map<Integer, T> getCustomizations(@StyleRes int defaultStyle, @AttrRes int customizedStyle, @NotNull int[] attributes, @NotNull Function2<? super TypedArray, ? super Integer, ? extends T> getValue) {
        Resources.Theme theme;
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(getValue, "getValue");
        TypedValue typedValue = new TypedValue();
        if (this.f13624b != 0) {
            theme = new ContextThemeWrapper(this, this.f13624b).getTheme();
            Intrinsics.checkNotNull(theme);
        } else {
            theme = getTheme();
            Intrinsics.checkNotNull(theme);
        }
        Arrays.sort(attributes);
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(defaultStyle, attributes);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        HashMap map = new HashMap();
        try {
            TypedArray typedArrayObtainStyledAttributes2 = theme.resolveAttribute(customizedStyle, typedValue, true) ? theme.obtainStyledAttributes(typedValue.data, attributes) : null;
            int length = attributes.length;
            for (int i11 = 0; i11 < length; i11++) {
                map.put(Integer.valueOf(attributes[i11]), getValue.invoke(typedArrayObtainStyledAttributes, Integer.valueOf(i11)));
                if (typedArrayObtainStyledAttributes2 != null && !Intrinsics.areEqual((Object) getValue.invoke(typedArrayObtainStyledAttributes2, Integer.valueOf(i11)), (Object) (-1))) {
                    map.put(Integer.valueOf(attributes[i11]), getValue.invoke(typedArrayObtainStyledAttributes2, Integer.valueOf(i11)));
                }
            }
        } catch (Exception e11) {
            Log.printStackTrace(e11);
        }
        return map;
    }

    @Override // jumio.core.InterfaceC40542I0
    @NotNull
    public AuthorizationModel.SessionKey getSessionKey() {
        return this.f13623a.getF14185c();
    }
}
