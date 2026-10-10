package com.fasterxml.jackson.databind.util;

import java.io.Serializable;

/* JADX INFO: loaded from: classes45.dex */
public class ViewMatcher implements Serializable {
    protected static final ViewMatcher EMPTY = new ViewMatcher();
    private static final long serialVersionUID = 1;

    public static final class Multi extends ViewMatcher implements Serializable {
        private static final long serialVersionUID = 1;
        private final Class<?>[] _views;

        @Override // com.fasterxml.jackson.databind.util.ViewMatcher
        public boolean isVisibleForView(Class<?> cls) {
            int length = this._views.length;
            for (int i11 = 0; i11 < length; i11++) {
                Class<?> cls2 = this._views[i11];
                if (cls == cls2 || cls2.isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }

        public Multi(Class<?>[] clsArr) {
            this._views = clsArr;
        }
    }

    public static final class Single extends ViewMatcher {
        private static final long serialVersionUID = 1;
        private final Class<?> _view;

        @Override // com.fasterxml.jackson.databind.util.ViewMatcher
        public boolean isVisibleForView(Class<?> cls) {
            Class<?> cls2 = this._view;
            return cls == cls2 || cls2.isAssignableFrom(cls);
        }

        public Single(Class<?> cls) {
            this._view = cls;
        }
    }

    public boolean isVisibleForView(Class<?> cls) {
        return false;
    }

    public static ViewMatcher construct(Class<?>[] clsArr) {
        if (clsArr == null) {
            return EMPTY;
        }
        int length = clsArr.length;
        if (length != 0) {
            return length != 1 ? new Multi(clsArr) : new Single(clsArr[0]);
        }
        return EMPTY;
    }
}
