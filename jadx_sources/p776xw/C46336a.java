package p776xw;

import android.annotation.SuppressLint;
import android.util.DisplayMetrics;
import android.widget.RelativeLayout;
import com.kubi.resources.widget.flyco.widget.MsgView;

/* JADX INFO: renamed from: xw.a */
/* JADX INFO: compiled from: UnreadMsgUtils.java */
/* JADX INFO: loaded from: classes13.dex */
public class C46336a {
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: a */
    public static void m102150a(MsgView msgView, int i11) {
        if (msgView == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) msgView.getLayoutParams();
        DisplayMetrics displayMetrics = msgView.getResources().getDisplayMetrics();
        msgView.setVisibility(0);
        if (i11 <= 0) {
            msgView.setText("");
            float f11 = displayMetrics.density;
            layoutParams.width = (int) (f11 * 9.0f);
            layoutParams.height = (int) (f11 * 9.0f);
            return;
        }
        float f12 = displayMetrics.density;
        layoutParams.height = (int) (f12 * 14.0f);
        if (i11 < 10) {
            layoutParams.width = (int) (f12 * 14.0f);
            msgView.setText(i11 + "");
        } else if (i11 < 100) {
            layoutParams.width = -2;
            msgView.setPadding((int) (f12 * 4.0f), 0, (int) (f12 * 4.0f), 0);
            msgView.setText(i11 + "");
        } else {
            layoutParams.width = -2;
            msgView.setPadding((int) (f12 * 4.0f), 0, (int) (f12 * 4.0f), 0);
            msgView.setText("99+");
        }
        msgView.setLayoutParams(layoutParams);
    }
}
