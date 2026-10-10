package p461n3;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import androidx.media3.exoplayer.upstream.CmcdData;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p189d3.C36605c;
import p464n6.C42757a;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: n3.c */
/* JADX INFO: compiled from: SuggestedEventViewHierarchy.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0010R\"\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00160\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017¨\u0006\u0019"}, m90084d2 = {"Ln3/c;", "", "<init>", "()V", "Landroid/view/View;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "clickedView", "Lorg/json/JSONObject;", "b", "(Landroid/view/View;Landroid/view/View;)Lorg/json/JSONObject;", JPushConstants.Analysis.KEY_JSON, "", "e", "(Landroid/view/View;Lorg/json/JSONObject;)V", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Landroid/view/View;)Ljava/util/List;", "hostView", "", "d", "(Landroid/view/View;)Ljava/lang/String;", "c", "Ljava/lang/Class;", "Ljava/util/List;", "blacklistedViews", "facebook-core_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class C42720c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42720c f94544a = new C42720c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final List<Class<? extends View>> blacklistedViews = CollectionsKt.listOf((Object[]) new Class[]{Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class});

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final List<View> m93616a(@NotNull View view) {
        if (C42757a.m93689d(C42720c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            ArrayList arrayList = new ArrayList();
            Iterator<Class<? extends View>> it = blacklistedViews.iterator();
            while (it.hasNext()) {
                if (it.next().isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            Iterator<View> it2 = C36605c.m81900b(view).iterator();
            while (it2.hasNext()) {
                arrayList.addAll(m93616a(it2.next()));
            }
            return arrayList;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C42720c.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final JSONObject m93617b(@NotNull View view, @NotNull View clickedView) {
        if (C42757a.m93689d(C42720c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(clickedView, "clickedView");
            JSONObject jSONObject = new JSONObject();
            if (view == clickedView) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            m93619e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator<View> it = C36605c.m81900b(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(m93617b(it.next(), clickedView));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C42720c.class);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m93618d(@NotNull View hostView) {
        if (C42757a.m93689d(C42720c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            String strM81907k = C36605c.m81907k(hostView);
            if (strM81907k.length() > 0) {
                return strM81907k;
            }
            String strJoin = TextUtils.join(C33627eb.f69716f, f94544a.m93620c(hostView));
            Intrinsics.checkNotNullExpressionValue(strJoin, "join(\" \", childrenText)");
            return strJoin;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C42720c.class);
            return null;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final void m93619e(@NotNull View view, @NotNull JSONObject json) {
        if (C42757a.m93689d(C42720c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                String strM81907k = C36605c.m81907k(view);
                String strM81905i = C36605c.m81905i(view);
                json.put("classname", view.getClass().getSimpleName());
                json.put("classtypebitmask", C36605c.m81901c(view));
                if (strM81907k.length() > 0) {
                    json.put("text", strM81907k);
                }
                if (strM81905i.length() > 0) {
                    json.put("hint", strM81905i);
                }
                if (view instanceof EditText) {
                    json.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            C42757a.m93687b(th2, C42720c.class);
        }
    }

    /* JADX INFO: renamed from: c */
    public final List<String> m93620c(View view) {
        if (C42757a.m93689d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View view2 : C36605c.m81900b(view)) {
                String strM81907k = C36605c.m81907k(view2);
                if (strM81907k.length() > 0) {
                    arrayList.add(strM81907k);
                }
                arrayList.addAll(m93620c(view2));
            }
            return arrayList;
        } catch (Throwable th2) {
            C42757a.m93687b(th2, this);
            return null;
        }
    }
}
