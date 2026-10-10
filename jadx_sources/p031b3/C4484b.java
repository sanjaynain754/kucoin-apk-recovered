package p031b3;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p189d3.C36605c;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: b3.b */
/* JADX INFO: compiled from: MetadataMatcher.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\tJ+\u0010\u000e\u001a\u00020\r2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\t¨\u0006\u0018"}, m90084d2 = {"Lb3/b;", "", "<init>", "()V", "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "", "", "b", "(Landroid/view/View;)Ljava/util/List;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "indicators", "keys", "", "e", "(Ljava/util/List;Ljava/util/List;)Z", "text", "rule", "f", "(Ljava/lang/String;Ljava/lang/String;)Z", "indicator", "d", "(Ljava/lang/String;Ljava/util/List;)Z", "c", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMetadataMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetadataMatcher.kt\ncom/facebook/appevents/aam/MetadataMatcher\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,116:1\n37#2,2:117\n*S KotlinDebug\n*F\n+ 1 MetadataMatcher.kt\ncom/facebook/appevents/aam/MetadataMatcher\n*L\n42#1:117,2\n*E\n"})
public final class C4484b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C4484b f3886a = new C4484b();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final List<String> m4270a(@NotNull View view) {
        if (C42757a.m93689d(C4484b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            ArrayList arrayList = new ArrayList();
            ViewGroup viewGroupM81906j = C36605c.m81906j(view);
            if (viewGroupM81906j != null) {
                for (View view2 : C36605c.m81900b(viewGroupM81906j)) {
                    if (view != view2) {
                        arrayList.addAll(f3886a.m4274c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C4484b.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final List<String> m4271b(@NotNull View view) {
        if (C42757a.m93689d(C4484b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            ArrayList<String> arrayList = new ArrayList();
            arrayList.add(C36605c.m81905i(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    Intrinsics.checkNotNullExpressionValue(resourceName, "resourceName");
                    String[] strArr = (String[]) new Regex("/").split(resourceName, 0).toArray(new String[0]);
                    if (strArr.length == 2) {
                        arrayList.add(strArr[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                if (str.length() > 0 && str.length() <= 100) {
                    String lowerCase = str.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                    arrayList2.add(lowerCase);
                }
            }
            return arrayList2;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C4484b.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m4272e(@NotNull List<String> indicators, @NotNull List<String> keys) {
        if (C42757a.m93689d(C4484b.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(indicators, "indicators");
            Intrinsics.checkNotNullParameter(keys, "keys");
            Iterator<String> it = indicators.iterator();
            while (it.hasNext()) {
                if (f3886a.m4275d(it.next(), keys)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C4484b.class);
            return false;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: f */
    public static final boolean m4273f(@NotNull String text, @NotNull String rule) {
        if (C42757a.m93689d(C4484b.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(rule, "rule");
            return new Regex(rule).matches(text);
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C4484b.class);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final List<String> m4274c(View view) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String string = ((TextView) view).getText().toString();
                if (string.length() > 0 && string.length() < 100) {
                    String lowerCase = string.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                    arrayList.add(lowerCase);
                    return arrayList;
                }
            } else {
                Iterator<View> it = C36605c.m81900b(view).iterator();
                while (it.hasNext()) {
                    arrayList.addAll(m4274c(it.next()));
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4275d(String indicator, List<String> keys) {
        if (C42757a.m93689d(this)) {
            return false;
        }
        try {
            Iterator<String> it = keys.iterator();
            while (it.hasNext()) {
                if (StringsKt.contains$default((CharSequence) indicator, (CharSequence) it.next(), false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return false;
        }
    }
}
