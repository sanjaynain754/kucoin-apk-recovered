package androidx.core.text;

import android.text.TextUtils;
import com.facebook.react.uimanager.ViewProps;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: Locale.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {ViewProps.LAYOUT_DIRECTION, "", "Ljava/util/Locale;", "getLayoutDirection", "(Ljava/util/Locale;)I", "core-ktx_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class LocaleKt {
    public static final int getLayoutDirection(@NotNull Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
