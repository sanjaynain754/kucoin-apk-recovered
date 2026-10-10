package com.kubi.resources.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$font;
import com.kubi.sdk.res.R$id;
import java.util.List;
import k00.C40847k;

/* JADX INFO: loaded from: classes13.dex */
public class SwitchFragmentBar extends FrameLayout {

    /* JADX INFO: renamed from: b */
    public C40847k f44085b;

    /* JADX INFO: renamed from: c */
    public List<? extends Fragment> f44086c;

    /* JADX INFO: renamed from: d */
    public FragmentManager f44087d;

    /* JADX INFO: renamed from: e */
    public int f44088e;

    /* JADX INFO: renamed from: com.kubi.resources.widget.SwitchFragmentBar$a */
    public interface InterfaceC22953a {
    }

    public SwitchFragmentBar(@NonNull Context context) {
        super(context);
        this.f44088e = -1;
        m54800e();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m54798c(SwitchFragmentBar switchFragmentBar, int i11) {
        if (i11 == switchFragmentBar.f44088e) {
            return;
        }
        if (i11 == 0) {
            switchFragmentBar.f44085b.f90777f.setChecked(true);
        } else if (i11 == 1) {
            switchFragmentBar.f44085b.f90778g.setChecked(true);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m54799d() {
        this.f44085b.f90774c.setVisibility(8);
        this.f44085b.f90776e.setVisibility(8);
        this.f44085b.f90775d.setVisibility(8);
        this.f44085b.f90779h.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) findViewById(R$id.fl_container).getLayoutParams()).topMargin = 0;
    }

    /* JADX INFO: renamed from: f */
    public void m54801f(int i11) {
        List<? extends Fragment> list;
        FragmentManager fragmentManager;
        if (((RadioButton) this.f44085b.f90776e.findViewById(i11)).isChecked() && (list = this.f44086c) != null && list.size() <= 2 && (fragmentManager = this.f44087d) != null) {
            FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
            for (Fragment fragment : this.f44087d.getFragments()) {
                if (fragment.isAdded() && !(fragment instanceof DialogFragment)) {
                    fragmentTransactionBeginTransaction.hide(fragment);
                    fragment.setUserVisibleHint(false);
                }
            }
            if (i11 == R$id.rb_one) {
                this.f44085b.f90777f.setTextColor(getContext().getColor(R$color.c_text));
                this.f44085b.f90778g.setTextColor(getContext().getColor(R$color.c_text60));
                this.f44085b.f90777f.setTypeface(ResourcesCompat.getFont(getContext(), R$font.medium));
                this.f44085b.f90778g.setTypeface(ResourcesCompat.getFont(getContext(), R$font.regular));
                if (this.f44086c.get(0).isAdded()) {
                    fragmentTransactionBeginTransaction.show(this.f44086c.get(0));
                } else {
                    fragmentTransactionBeginTransaction.add(R$id.fl_container, this.f44086c.get(0), this.f44086c.get(0).toString());
                }
                this.f44086c.get(0).setUserVisibleHint(true);
                this.f44088e = 0;
            } else if (i11 == R$id.rb_two) {
                this.f44085b.f90777f.setTextColor(getContext().getColor(R$color.c_text60));
                this.f44085b.f90778g.setTextColor(getContext().getColor(R$color.c_text));
                this.f44085b.f90777f.setTypeface(ResourcesCompat.getFont(getContext(), R$font.regular));
                this.f44085b.f90778g.setTypeface(ResourcesCompat.getFont(getContext(), R$font.medium));
                if (this.f44086c.get(1).isAdded()) {
                    fragmentTransactionBeginTransaction.show(this.f44086c.get(1));
                } else {
                    fragmentTransactionBeginTransaction.add(R$id.fl_container, this.f44086c.get(1), this.f44086c.get(1).toString());
                }
                this.f44086c.get(1).setUserVisibleHint(true);
                this.f44088e = 1;
            }
            fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        }
    }

    public int getCurrentItem() {
        return this.f44088e;
    }

    public ImageView getIvBack() {
        return this.f44085b.f90774c;
    }

    public ImageView getIvRight() {
        return this.f44085b.f90775d;
    }

    public RadioGroup getRbGroup() {
        return this.f44085b.f90776e;
    }

    public TextView getRightText() {
        return this.f44085b.f90779h;
    }

    /* JADX INFO: renamed from: h */
    public void m54803h(List<? extends Fragment> list, FragmentManager fragmentManager) {
        this.f44086c = list;
        this.f44087d = fragmentManager;
        setCurrentItem(0);
    }

    public void setCurrentItem(final int i11) {
        post(new Runnable() { // from class: com.kubi.resources.widget.f2
            @Override // java.lang.Runnable
            public final void run() {
                SwitchFragmentBar.m54798c(this.f44577b, i11);
            }
        });
    }

    public void setRightTextListener(View.OnClickListener onClickListener) {
        this.f44085b.f90779h.setOnClickListener(onClickListener);
        this.f44085b.f90779h.setVisibility(0);
    }

    public void setTextOneLabel(String str) {
        this.f44085b.f90777f.setText(str);
    }

    public void setTextTwoLabel(String str) {
        this.f44085b.f90778g.setText(str);
    }

    /* JADX INFO: renamed from: e */
    public final void m54800e() {
        C40847k c40847kM89394b = C40847k.m89394b(LayoutInflater.from(getContext()), this);
        this.f44085b = c40847kM89394b;
        View root = c40847kM89394b.getRoot();
        this.f44085b.f90776e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.kubi.resources.widget.d2
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i11) {
                this.f44526b.m54801f(i11);
            }
        });
        root.findViewById(R$id.iv_back).setOnClickListener(new View.OnClickListener() { // from class: com.kubi.resources.widget.e2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f44560b.m54802g();
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m54802g() {
        if (getContext() instanceof FragmentActivity) {
            ((FragmentActivity) getContext()).onBackPressed();
        }
    }

    public SwitchFragmentBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44088e = -1;
        m54800e();
    }

    public SwitchFragmentBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f44088e = -1;
        m54800e();
    }

    public void addSelectedChangeListener(InterfaceC22953a interfaceC22953a) {
    }
}
