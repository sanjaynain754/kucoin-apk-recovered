package p189d3;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.text.CharsKt;
import p852kotlin.text.Regex;

/* JADX INFO: renamed from: d3.a */
/* JADX INFO: compiled from: SensitiveUserDataUtils.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, m90084d2 = {"Ld3/a;", "", "<init>", "()V", "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "", "g", "(Landroid/view/View;)Z", "Landroid/widget/TextView;", "c", "(Landroid/widget/TextView;)Z", "b", "d", "f", "e", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C36603a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C36603a f79402a = new C36603a();

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final boolean m81888g(@Nullable View view) {
        if (C42757a.m93689d(C36603a.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            C36603a c36603a = f79402a;
            return c36603a.m81891c((TextView) view) || c36603a.m81889a((TextView) view) || c36603a.m81892d((TextView) view) || c36603a.m81894f((TextView) view) || c36603a.m81893e((TextView) view) || c36603a.m81890b((TextView) view);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C36603a.class);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m81889a(TextView view) {
        if (C42757a.m93689d(this)) {
            return false;
        }
        try {
            String strReplace = new Regex("\\s").replace(C36605c.m81907k(view), "");
            int length = strReplace.length();
            if (length >= 12 && length <= 19) {
                int i11 = 0;
                boolean z11 = false;
                for (int i12 = length - 1; -1 < i12; i12--) {
                    char cCharAt = strReplace.charAt(i12);
                    if (!Character.isDigit(cCharAt)) {
                        return false;
                    }
                    int iDigitToInt = CharsKt.digitToInt(cCharAt);
                    if (z11 && (iDigitToInt = iDigitToInt * 2) > 9) {
                        iDigitToInt = (iDigitToInt % 10) + 1;
                    }
                    i11 += iDigitToInt;
                    z11 = !z11;
                }
                if (i11 % 10 == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m81890b(TextView view) {
        if (C42757a.m93689d(this)) {
            return false;
        }
        try {
            if (view.getInputType() == 32) {
                return true;
            }
            String strM81907k = C36605c.m81907k(view);
            if (strM81907k != null && strM81907k.length() != 0) {
                return Patterns.EMAIL_ADDRESS.matcher(strM81907k).matches();
            }
            return false;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m81891c(TextView view) {
        if (C42757a.m93689d(this)) {
            return false;
        }
        try {
            if (view.getInputType() == 128) {
                return true;
            }
            return view.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m81892d(TextView view) {
        if (C42757a.m93689d(this)) {
            return false;
        }
        try {
            if (view.getInputType() != 96) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m81893e(TextView view) {
        if (C42757a.m93689d(this)) {
            return false;
        }
        try {
            if (view.getInputType() != 3) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m81894f(TextView view) {
        if (C42757a.m93689d(this)) {
            return false;
        }
        try {
            if (view.getInputType() != 112) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return false;
        }
    }
}
