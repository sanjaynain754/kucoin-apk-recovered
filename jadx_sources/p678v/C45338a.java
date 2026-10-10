package p678v;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import p387k.C40834i;

/* JADX INFO: renamed from: v.a */
/* JADX INFO: loaded from: classes23.dex */
public class C45338a extends PopupWindow {

    /* JADX INFO: renamed from: a */
    public final TextView f101939a;

    /* JADX INFO: renamed from: b */
    public final ImageView f101940b;

    public C45338a(Context context) {
        super(-2, -2);
        m100233c();
        Resources resources = context.getResources();
        View viewInflate = LayoutInflater.from(context).inflate(resources.getIdentifier("global_iqa_window_tip", TtmlNode.TAG_LAYOUT, context.getPackageName()), (ViewGroup) null);
        this.f101939a = (TextView) viewInflate.findViewById(resources.getIdentifier("iqa_window_tip_text", "id", context.getPackageName()));
        this.f101940b = (ImageView) viewInflate.findViewById(resources.getIdentifier("iqa_window_tip_image", "id", context.getPackageName()));
        setContentView(viewInflate);
        m100233c();
        setBackgroundDrawable(resources.getDrawable(resources.getIdentifier("iqa_timeout_tips_bg", "drawable", context.getPackageName())));
    }

    /* JADX INFO: renamed from: a */
    public void m100231a(CharSequence charSequence) {
        if (charSequence != null) {
            this.f101939a.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m100233c() {
        int i11;
        int i12;
        int i13 = C40834i.f90707b;
        int i14 = C40834i.f90708c;
        if (i13 > i14) {
            i12 = (int) (((double) i14) * 0.45d);
            i11 = (int) ((i12 * 649) / 327.0f);
        } else {
            i11 = (int) (((double) i13) * 0.9d);
            i12 = (int) ((i11 * 327) / 549.0f);
        }
        setWidth(i11);
        setHeight(i12);
    }

    /* JADX INFO: renamed from: b */
    public void m100232b(CharSequence charSequence, int i11) {
        m100231a(charSequence);
        this.f101940b.setImageResource(i11);
    }
}
