package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes45.dex */
public class CoercionConfigs implements Serializable {

    /* JADX INFO: renamed from: b */
    public static final int f10207b = LogicalType.values().length;
    private static final long serialVersionUID = 1;
    protected CoercionAction _defaultAction;
    protected final MutableCoercionConfig _defaultCoercions;
    protected Map<Class<?>, MutableCoercionConfig> _perClassCoercions;
    protected MutableCoercionConfig[] _perTypeCoercions;

    public CoercionConfigs() {
        this(CoercionAction.TryConvert, new MutableCoercionConfig(), null, null);
    }

    public MutableCoercionConfig findOrCreateCoercion(LogicalType logicalType) {
        if (this._perTypeCoercions == null) {
            this._perTypeCoercions = new MutableCoercionConfig[f10207b];
        }
        MutableCoercionConfig mutableCoercionConfig = this._perTypeCoercions[logicalType.ordinal()];
        if (mutableCoercionConfig != null) {
            return mutableCoercionConfig;
        }
        MutableCoercionConfig[] mutableCoercionConfigArr = this._perTypeCoercions;
        int iOrdinal = logicalType.ordinal();
        MutableCoercionConfig mutableCoercionConfig2 = new MutableCoercionConfig();
        mutableCoercionConfigArr[iOrdinal] = mutableCoercionConfig2;
        return mutableCoercionConfig2;
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.cfg.CoercionConfigs$a */
    public static /* synthetic */ class C6342a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10208a;

        static {
            int[] iArr = new int[CoercionInputShape.values().length];
            f10208a = iArr;
            try {
                iArr[CoercionInputShape.EmptyArray.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10208a[CoercionInputShape.Float.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10208a[CoercionInputShape.Integer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public CoercionConfigs(CoercionAction coercionAction, MutableCoercionConfig mutableCoercionConfig, MutableCoercionConfig[] mutableCoercionConfigArr, Map<Class<?>, MutableCoercionConfig> map) {
        this._defaultCoercions = mutableCoercionConfig;
        this._defaultAction = coercionAction;
        this._perTypeCoercions = mutableCoercionConfigArr;
        this._perClassCoercions = map;
    }

    /* JADX INFO: renamed from: a */
    public static MutableCoercionConfig m11183a(MutableCoercionConfig mutableCoercionConfig) {
        if (mutableCoercionConfig == null) {
            return null;
        }
        return mutableCoercionConfig.copy();
    }

    public boolean _isScalarType(LogicalType logicalType) {
        return logicalType == LogicalType.Float || logicalType == LogicalType.Integer || logicalType == LogicalType.Boolean || logicalType == LogicalType.DateTime;
    }

    public CoercionConfigs copy() {
        MutableCoercionConfig[] mutableCoercionConfigArr;
        MutableCoercionConfig[] mutableCoercionConfigArr2 = this._perTypeCoercions;
        HashMap map = null;
        if (mutableCoercionConfigArr2 == null) {
            mutableCoercionConfigArr = null;
        } else {
            int length = mutableCoercionConfigArr2.length;
            mutableCoercionConfigArr = new MutableCoercionConfig[length];
            for (int i11 = 0; i11 < length; i11++) {
                mutableCoercionConfigArr[i11] = m11183a(this._perTypeCoercions[i11]);
            }
        }
        if (this._perClassCoercions != null) {
            map = new HashMap();
            for (Map.Entry<Class<?>, MutableCoercionConfig> entry : this._perClassCoercions.entrySet()) {
                map.put(entry.getKey(), entry.getValue().copy());
            }
        }
        return new CoercionConfigs(this._defaultAction, this._defaultCoercions.copy(), mutableCoercionConfigArr, map);
    }

    public MutableCoercionConfig defaultCoercions() {
        return this._defaultCoercions;
    }

    public CoercionAction findCoercion(DeserializationConfig deserializationConfig, LogicalType logicalType, Class<?> cls, CoercionInputShape coercionInputShape) {
        MutableCoercionConfig mutableCoercionConfig;
        CoercionAction coercionActionFindAction;
        MutableCoercionConfig mutableCoercionConfig2;
        CoercionAction coercionActionFindAction2;
        Map<Class<?>, MutableCoercionConfig> map = this._perClassCoercions;
        if (map != null && cls != null && (mutableCoercionConfig2 = map.get(cls)) != null && (coercionActionFindAction2 = mutableCoercionConfig2.findAction(coercionInputShape)) != null) {
            return coercionActionFindAction2;
        }
        MutableCoercionConfig[] mutableCoercionConfigArr = this._perTypeCoercions;
        if (mutableCoercionConfigArr != null && logicalType != null && (mutableCoercionConfig = mutableCoercionConfigArr[logicalType.ordinal()]) != null && (coercionActionFindAction = mutableCoercionConfig.findAction(coercionInputShape)) != null) {
            return coercionActionFindAction;
        }
        CoercionAction coercionActionFindAction3 = this._defaultCoercions.findAction(coercionInputShape);
        if (coercionActionFindAction3 != null) {
            return coercionActionFindAction3;
        }
        int i11 = C6342a.f10208a[coercionInputShape.ordinal()];
        if (i11 == 1) {
            return deserializationConfig.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT) ? CoercionAction.AsNull : CoercionAction.Fail;
        }
        if (i11 != 2) {
            if (i11 == 3 && logicalType == LogicalType.Enum && deserializationConfig.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS)) {
                return CoercionAction.Fail;
            }
        } else if (logicalType == LogicalType.Integer) {
            return deserializationConfig.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT) ? CoercionAction.TryConvert : CoercionAction.Fail;
        }
        boolean z_isScalarType = _isScalarType(logicalType);
        if (z_isScalarType && !deserializationConfig.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)) {
            return CoercionAction.Fail;
        }
        if (coercionInputShape != CoercionInputShape.EmptyString) {
            return this._defaultAction;
        }
        if (z_isScalarType || deserializationConfig.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
            return CoercionAction.AsNull;
        }
        return logicalType == LogicalType.OtherScalar ? CoercionAction.TryConvert : CoercionAction.Fail;
    }

    public CoercionAction findCoercionFromBlankString(DeserializationConfig deserializationConfig, LogicalType logicalType, Class<?> cls, CoercionAction coercionAction) {
        Boolean acceptBlankAsEmpty;
        CoercionAction coercionActionFindAction;
        MutableCoercionConfig mutableCoercionConfig;
        MutableCoercionConfig mutableCoercionConfig2;
        Map<Class<?>, MutableCoercionConfig> map = this._perClassCoercions;
        if (map == null || cls == null || (mutableCoercionConfig2 = map.get(cls)) == null) {
            acceptBlankAsEmpty = null;
            coercionActionFindAction = null;
        } else {
            acceptBlankAsEmpty = mutableCoercionConfig2.getAcceptBlankAsEmpty();
            coercionActionFindAction = mutableCoercionConfig2.findAction(CoercionInputShape.EmptyString);
        }
        MutableCoercionConfig[] mutableCoercionConfigArr = this._perTypeCoercions;
        if (mutableCoercionConfigArr != null && logicalType != null && (mutableCoercionConfig = mutableCoercionConfigArr[logicalType.ordinal()]) != null) {
            if (acceptBlankAsEmpty == null) {
                acceptBlankAsEmpty = mutableCoercionConfig.getAcceptBlankAsEmpty();
            }
            if (coercionActionFindAction == null) {
                coercionActionFindAction = mutableCoercionConfig.findAction(CoercionInputShape.EmptyString);
            }
        }
        if (acceptBlankAsEmpty == null) {
            acceptBlankAsEmpty = this._defaultCoercions.getAcceptBlankAsEmpty();
        }
        if (coercionActionFindAction == null) {
            coercionActionFindAction = this._defaultCoercions.findAction(CoercionInputShape.EmptyString);
        }
        if (!Boolean.FALSE.equals(acceptBlankAsEmpty)) {
            if (coercionActionFindAction != null) {
                return coercionActionFindAction;
            }
            if (_isScalarType(logicalType)) {
                return CoercionAction.AsNull;
            }
            if (deserializationConfig.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
                return CoercionAction.AsNull;
            }
        }
        return coercionAction;
    }

    public MutableCoercionConfig findOrCreateCoercion(Class<?> cls) {
        if (this._perClassCoercions == null) {
            this._perClassCoercions = new HashMap();
        }
        MutableCoercionConfig mutableCoercionConfig = this._perClassCoercions.get(cls);
        if (mutableCoercionConfig != null) {
            return mutableCoercionConfig;
        }
        MutableCoercionConfig mutableCoercionConfig2 = new MutableCoercionConfig();
        this._perClassCoercions.put(cls, mutableCoercionConfig2);
        return mutableCoercionConfig2;
    }
}
