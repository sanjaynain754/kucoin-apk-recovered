package com.blankj.utilcode.util;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.blankj.utilcode.util.o */
/* JADX INFO: compiled from: FragmentUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class C5286o {

    /* JADX INFO: renamed from: com.blankj.utilcode.util.o$a */
    /* JADX INFO: compiled from: FragmentUtils.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f6576a;

        /* JADX INFO: renamed from: b */
        public final boolean f6577b;

        /* JADX INFO: renamed from: c */
        public final boolean f6578c;

        /* JADX INFO: renamed from: d */
        public final String f6579d;

        public a(int i11, String str, boolean z11, boolean z12) {
            this.f6576a = i11;
            this.f6579d = str;
            this.f6577b = z11;
            this.f6578c = z12;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m6317a(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i11) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment == null) {
            throw new NullPointerException("Argument 'add' of type Fragment (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        m6318b(fragmentManager, fragment, i11, null, false, false);
    }

    /* JADX INFO: renamed from: b */
    public static void m6318b(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i11, String str, boolean z11, boolean z12) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 6, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment == null) {
            throw new NullPointerException("Argument 'add' of type Fragment (#1 out of 6, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        m6323g(fragment, new a(i11, str, z11, z12));
        m6322f(fragmentManager, 1, null, fragment);
    }

    /* JADX INFO: renamed from: c */
    public static Fragment m6319c(@NonNull FragmentManager fragmentManager, @NonNull String str) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (str != null) {
            return fragmentManager.findFragmentByTag(str);
        }
        throw new NullPointerException("Argument 'tag' of type String (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* JADX INFO: renamed from: d */
    public static List<Fragment> m6320d(@NonNull FragmentManager fragmentManager) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        List<Fragment> fragments = fragmentManager.getFragments();
        return (fragments == null || fragments.isEmpty()) ? Collections.EMPTY_LIST : fragments;
    }

    /* JADX INFO: renamed from: e */
    public static void m6321e(int i11, @NonNull FragmentManager fragmentManager, FragmentTransaction fragmentTransaction, Fragment fragment, Fragment... fragmentArr) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#1 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment != null && fragment.isRemoving()) {
            Log.e("FragmentUtils", fragment.getClass().getName() + " is isRemoving");
            return;
        }
        int i12 = 0;
        if (i11 == 1) {
            int length = fragmentArr.length;
            while (i12 < length) {
                Fragment fragment2 = fragmentArr[i12];
                Bundle arguments = fragment2.getArguments();
                if (arguments == null) {
                    return;
                }
                String string = arguments.getString("args_tag", fragment2.getClass().getName());
                Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag(string);
                if (fragmentFindFragmentByTag != null && fragmentFindFragmentByTag.isAdded()) {
                    fragmentTransaction.remove(fragmentFindFragmentByTag);
                }
                fragmentTransaction.add(arguments.getInt("args_id"), fragment2, string);
                if (arguments.getBoolean("args_is_hide")) {
                    fragmentTransaction.hide(fragment2);
                }
                if (arguments.getBoolean("args_is_add_stack")) {
                    fragmentTransaction.addToBackStack(string);
                }
                i12++;
            }
        } else if (i11 == 2) {
            int length2 = fragmentArr.length;
            while (i12 < length2) {
                fragmentTransaction.show(fragmentArr[i12]);
                i12++;
            }
        } else if (i11 == 4) {
            int length3 = fragmentArr.length;
            while (i12 < length3) {
                fragmentTransaction.hide(fragmentArr[i12]);
                i12++;
            }
        } else if (i11 == 8) {
            fragmentTransaction.show(fragment);
            int length4 = fragmentArr.length;
            while (i12 < length4) {
                Fragment fragment3 = fragmentArr[i12];
                if (fragment3 != fragment) {
                    fragmentTransaction.hide(fragment3);
                }
                i12++;
            }
        } else if (i11 == 16) {
            Bundle arguments2 = fragmentArr[0].getArguments();
            if (arguments2 == null) {
                return;
            }
            String string2 = arguments2.getString("args_tag", fragmentArr[0].getClass().getName());
            fragmentTransaction.replace(arguments2.getInt("args_id"), fragmentArr[0], string2);
            if (arguments2.getBoolean("args_is_add_stack")) {
                fragmentTransaction.addToBackStack(string2);
            }
        } else if (i11 == 32) {
            int length5 = fragmentArr.length;
            while (i12 < length5) {
                Fragment fragment4 = fragmentArr[i12];
                if (fragment4 != fragment) {
                    fragmentTransaction.remove(fragment4);
                }
                i12++;
            }
        } else if (i11 == 64) {
            for (int length6 = fragmentArr.length - 1; length6 >= 0; length6--) {
                Fragment fragment5 = fragmentArr[length6];
                if (fragment5 == fragmentArr[0]) {
                    if (fragment == null) {
                        break;
                    }
                    fragmentTransaction.remove(fragment5);
                    break;
                }
                fragmentTransaction.remove(fragment5);
            }
        }
        fragmentTransaction.commitAllowingStateLoss();
    }

    /* JADX INFO: renamed from: f */
    public static void m6322f(@Nullable FragmentManager fragmentManager, int i11, Fragment fragment, Fragment... fragmentArr) {
        if (fragmentManager == null) {
            return;
        }
        m6321e(i11, fragmentManager, fragmentManager.beginTransaction(), fragment, fragmentArr);
    }

    /* JADX INFO: renamed from: i */
    public static void m6325i(@NonNull Fragment fragment) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'remove' of type Fragment (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        m6322f(fragment.getFragmentManager(), 32, null, fragment);
    }

    /* JADX INFO: renamed from: j */
    public static void m6326j(@NonNull FragmentManager fragmentManager) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        m6322f(fragmentManager, 32, null, (Fragment[]) m6320d(fragmentManager).toArray(new Fragment[0]));
    }

    /* JADX INFO: renamed from: k */
    public static void m6327k(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i11) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment == null) {
            throw new NullPointerException("Argument 'fragment' of type Fragment (#1 out of 3, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        m6328l(fragmentManager, fragment, i11, null, false);
    }

    /* JADX INFO: renamed from: l */
    public static void m6328l(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @IdRes int i11, String str, boolean z11) {
        if (fragmentManager == null) {
            throw new NullPointerException("Argument 'fm' of type FragmentManager (#0 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment == null) {
            throw new NullPointerException("Argument 'fragment' of type Fragment (#1 out of 5, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
        m6323g(fragment, new a(i11, str, false, z11));
        m6321e(16, fragmentManager, fragmentTransactionBeginTransaction, null, fragment);
    }

    /* JADX INFO: renamed from: m */
    public static void m6329m(@NonNull Fragment fragment) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'show' of type Fragment (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        m6324h(fragment, false);
        m6322f(fragment.getFragmentManager(), 2, null, fragment);
    }

    /* JADX INFO: renamed from: n */
    public static void m6330n(@NonNull Fragment fragment, @NonNull Fragment fragment2) {
        if (fragment == null) {
            throw new NullPointerException("Argument 'show' of type Fragment (#0 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        if (fragment2 == null) {
            throw new NullPointerException("Argument 'hide' of type Fragment (#1 out of 2, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        m6324h(fragment, false);
        m6324h(fragment2, true);
        m6322f(fragment.getFragmentManager(), 8, fragment, fragment2);
    }

    /* JADX INFO: renamed from: g */
    public static void m6323g(Fragment fragment, a aVar) {
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            fragment.setArguments(arguments);
        }
        arguments.putInt("args_id", aVar.f6576a);
        arguments.putBoolean("args_is_hide", aVar.f6577b);
        arguments.putBoolean("args_is_add_stack", aVar.f6578c);
        arguments.putString("args_tag", aVar.f6579d);
    }

    /* JADX INFO: renamed from: h */
    public static void m6324h(Fragment fragment, boolean z11) {
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            fragment.setArguments(arguments);
        }
        arguments.putBoolean("args_is_hide", z11);
    }
}
