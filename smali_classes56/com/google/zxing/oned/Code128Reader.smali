.class public final Lcom/google/zxing/oned/Code128Reader;
.super Lcom/google/zxing/oned/OneDReader;
.source "Code128Reader.java"


# static fields
.field private static final CODE_CODE_A:I = 0x65

.field private static final CODE_CODE_B:I = 0x64

.field private static final CODE_CODE_C:I = 0x63

.field private static final CODE_FNC_1:I = 0x66

.field private static final CODE_FNC_2:I = 0x61

.field private static final CODE_FNC_3:I = 0x60

.field private static final CODE_FNC_4_A:I = 0x65

.field private static final CODE_FNC_4_B:I = 0x64

.field static final CODE_PATTERNS:[[I

.field private static final CODE_SHIFT:I = 0x62

.field private static final CODE_START_A:I = 0x67

.field private static final CODE_START_B:I = 0x68

.field private static final CODE_START_C:I = 0x69

.field private static final CODE_STOP:I = 0x6a

.field private static final MAX_AVG_VARIANCE:F = 0.25f

.field private static final MAX_INDIVIDUAL_VARIANCE:F = 0.7f


# direct methods
.method static constructor <clinit>()V
    .locals 108

    const/4 v0, 0x6

    .line 1
    new-array v1, v0, [I

    fill-array-data v1, :array_0

    new-array v2, v0, [I

    fill-array-data v2, :array_1

    new-array v3, v0, [I

    fill-array-data v3, :array_2

    new-array v4, v0, [I

    fill-array-data v4, :array_3

    new-array v5, v0, [I

    fill-array-data v5, :array_4

    new-array v6, v0, [I

    fill-array-data v6, :array_5

    new-array v7, v0, [I

    fill-array-data v7, :array_6

    new-array v8, v0, [I

    fill-array-data v8, :array_7

    new-array v9, v0, [I

    fill-array-data v9, :array_8

    new-array v10, v0, [I

    fill-array-data v10, :array_9

    new-array v11, v0, [I

    fill-array-data v11, :array_a

    new-array v12, v0, [I

    fill-array-data v12, :array_b

    new-array v13, v0, [I

    fill-array-data v13, :array_c

    new-array v14, v0, [I

    fill-array-data v14, :array_d

    new-array v15, v0, [I

    fill-array-data v15, :array_e

    move-object/from16 v16, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_f

    move-object/from16 v17, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_10

    move-object/from16 v18, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_11

    move-object/from16 v19, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_12

    move-object/from16 v20, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_13

    move-object/from16 v21, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_14

    move-object/from16 v22, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_15

    move-object/from16 v23, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_16

    move-object/from16 v24, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_17

    move-object/from16 v25, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_18

    move-object/from16 v26, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_19

    move-object/from16 v27, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_1a

    move-object/from16 v28, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_1b

    move-object/from16 v29, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_1c

    move-object/from16 v30, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_1d

    move-object/from16 v31, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_1e

    move-object/from16 v32, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_1f

    move-object/from16 v33, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_20

    move-object/from16 v34, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_21

    move-object/from16 v35, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_22

    move-object/from16 v36, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_23

    move-object/from16 v37, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_24

    move-object/from16 v38, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_25

    move-object/from16 v39, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_26

    move-object/from16 v40, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_27

    move-object/from16 v41, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_28

    move-object/from16 v42, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_29

    move-object/from16 v43, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_2a

    move-object/from16 v44, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_2b

    move-object/from16 v45, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_2c

    move-object/from16 v46, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_2d

    move-object/from16 v47, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_2e

    move-object/from16 v48, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_2f

    move-object/from16 v49, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_30

    move-object/from16 v50, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_31

    move-object/from16 v51, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_32

    move-object/from16 v52, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_33

    move-object/from16 v53, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_34

    move-object/from16 v54, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_35

    move-object/from16 v55, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_36

    move-object/from16 v56, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_37

    move-object/from16 v57, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_38

    move-object/from16 v58, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_39

    move-object/from16 v59, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_3a

    move-object/from16 v60, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_3b

    move-object/from16 v61, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_3c

    move-object/from16 v62, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_3d

    move-object/from16 v63, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_3e

    move-object/from16 v64, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_3f

    move-object/from16 v65, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_40

    move-object/from16 v66, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_41

    move-object/from16 v67, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_42

    move-object/from16 v68, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_43

    move-object/from16 v69, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_44

    move-object/from16 v70, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_45

    move-object/from16 v71, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_46

    move-object/from16 v72, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_47

    move-object/from16 v73, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_48

    move-object/from16 v74, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_49

    move-object/from16 v75, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_4a

    move-object/from16 v76, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_4b

    move-object/from16 v77, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_4c

    move-object/from16 v78, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_4d

    move-object/from16 v79, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_4e

    move-object/from16 v80, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_4f

    move-object/from16 v81, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_50

    move-object/from16 v82, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_51

    move-object/from16 v83, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_52

    move-object/from16 v84, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_53

    move-object/from16 v85, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_54

    move-object/from16 v86, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_55

    move-object/from16 v87, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_56

    move-object/from16 v88, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_57

    move-object/from16 v89, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_58

    move-object/from16 v90, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_59

    move-object/from16 v91, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_5a

    move-object/from16 v92, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_5b

    move-object/from16 v93, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_5c

    move-object/from16 v94, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_5d

    move-object/from16 v95, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_5e

    move-object/from16 v96, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_5f

    move-object/from16 v97, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_60

    move-object/from16 v98, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_61

    move-object/from16 v99, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_62

    move-object/from16 v100, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_63

    move-object/from16 v101, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_64

    move-object/from16 v102, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_65

    move-object/from16 v103, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_66

    move-object/from16 v104, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_67

    move-object/from16 v105, v1

    new-array v1, v0, [I

    fill-array-data v1, :array_68

    new-array v0, v0, [I

    fill-array-data v0, :array_69

    move-object/from16 v106, v0

    const/4 v0, 0x7

    new-array v0, v0, [I

    fill-array-data v0, :array_6a

    move-object/from16 v107, v105

    move-object/from16 v105, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v20, v21

    move-object/from16 v21, v22

    move-object/from16 v22, v23

    move-object/from16 v23, v24

    move-object/from16 v24, v25

    move-object/from16 v25, v26

    move-object/from16 v26, v27

    move-object/from16 v27, v28

    move-object/from16 v28, v29

    move-object/from16 v29, v30

    move-object/from16 v30, v31

    move-object/from16 v31, v32

    move-object/from16 v32, v33

    move-object/from16 v33, v34

    move-object/from16 v34, v35

    move-object/from16 v35, v36

    move-object/from16 v36, v37

    move-object/from16 v37, v38

    move-object/from16 v38, v39

    move-object/from16 v39, v40

    move-object/from16 v40, v41

    move-object/from16 v41, v42

    move-object/from16 v42, v43

    move-object/from16 v43, v44

    move-object/from16 v44, v45

    move-object/from16 v45, v46

    move-object/from16 v46, v47

    move-object/from16 v47, v48

    move-object/from16 v48, v49

    move-object/from16 v49, v50

    move-object/from16 v50, v51

    move-object/from16 v51, v52

    move-object/from16 v52, v53

    move-object/from16 v53, v54

    move-object/from16 v54, v55

    move-object/from16 v55, v56

    move-object/from16 v56, v57

    move-object/from16 v57, v58

    move-object/from16 v58, v59

    move-object/from16 v59, v60

    move-object/from16 v60, v61

    move-object/from16 v61, v62

    move-object/from16 v62, v63

    move-object/from16 v63, v64

    move-object/from16 v64, v65

    move-object/from16 v65, v66

    move-object/from16 v66, v67

    move-object/from16 v67, v68

    move-object/from16 v68, v69

    move-object/from16 v69, v70

    move-object/from16 v70, v71

    move-object/from16 v71, v72

    move-object/from16 v72, v73

    move-object/from16 v73, v74

    move-object/from16 v74, v75

    move-object/from16 v75, v76

    move-object/from16 v76, v77

    move-object/from16 v77, v78

    move-object/from16 v78, v79

    move-object/from16 v79, v80

    move-object/from16 v80, v81

    move-object/from16 v81, v82

    move-object/from16 v82, v83

    move-object/from16 v83, v84

    move-object/from16 v84, v85

    move-object/from16 v85, v86

    move-object/from16 v86, v87

    move-object/from16 v87, v88

    move-object/from16 v88, v89

    move-object/from16 v89, v90

    move-object/from16 v90, v91

    move-object/from16 v91, v92

    move-object/from16 v92, v93

    move-object/from16 v93, v94

    move-object/from16 v94, v95

    move-object/from16 v95, v96

    move-object/from16 v96, v97

    move-object/from16 v97, v98

    move-object/from16 v98, v99

    move-object/from16 v99, v100

    move-object/from16 v100, v101

    move-object/from16 v101, v102

    move-object/from16 v102, v103

    move-object/from16 v103, v104

    move-object/from16 v104, v107

    move-object/from16 v107, v0

    filled-new-array/range {v1 .. v107}, [[I

    move-result-object v0

    sput-object v0, Lcom/google/zxing/oned/Code128Reader;->CODE_PATTERNS:[[I

    return-void

    :array_0
    .array-data 4
        0x2
        0x1
        0x2
        0x2
        0x2
        0x2
    .end array-data

    :array_1
    .array-data 4
        0x2
        0x2
        0x2
        0x1
        0x2
        0x2
    .end array-data

    :array_2
    .array-data 4
        0x2
        0x2
        0x2
        0x2
        0x2
        0x1
    .end array-data

    :array_3
    .array-data 4
        0x1
        0x2
        0x1
        0x2
        0x2
        0x3
    .end array-data

    :array_4
    .array-data 4
        0x1
        0x2
        0x1
        0x3
        0x2
        0x2
    .end array-data

    :array_5
    .array-data 4
        0x1
        0x3
        0x1
        0x2
        0x2
        0x2
    .end array-data

    :array_6
    .array-data 4
        0x1
        0x2
        0x2
        0x2
        0x1
        0x3
    .end array-data

    :array_7
    .array-data 4
        0x1
        0x2
        0x2
        0x3
        0x1
        0x2
    .end array-data

    :array_8
    .array-data 4
        0x1
        0x3
        0x2
        0x2
        0x1
        0x2
    .end array-data

    :array_9
    .array-data 4
        0x2
        0x2
        0x1
        0x2
        0x1
        0x3
    .end array-data

    :array_a
    .array-data 4
        0x2
        0x2
        0x1
        0x3
        0x1
        0x2
    .end array-data

    :array_b
    .array-data 4
        0x2
        0x3
        0x1
        0x2
        0x1
        0x2
    .end array-data

    :array_c
    .array-data 4
        0x1
        0x1
        0x2
        0x2
        0x3
        0x2
    .end array-data

    :array_d
    .array-data 4
        0x1
        0x2
        0x2
        0x1
        0x3
        0x2
    .end array-data

    :array_e
    .array-data 4
        0x1
        0x2
        0x2
        0x2
        0x3
        0x1
    .end array-data

    :array_f
    .array-data 4
        0x1
        0x1
        0x3
        0x2
        0x2
        0x2
    .end array-data

    :array_10
    .array-data 4
        0x1
        0x2
        0x3
        0x1
        0x2
        0x2
    .end array-data

    :array_11
    .array-data 4
        0x1
        0x2
        0x3
        0x2
        0x2
        0x1
    .end array-data

    :array_12
    .array-data 4
        0x2
        0x2
        0x3
        0x2
        0x1
        0x1
    .end array-data

    :array_13
    .array-data 4
        0x2
        0x2
        0x1
        0x1
        0x3
        0x2
    .end array-data

    :array_14
    .array-data 4
        0x2
        0x2
        0x1
        0x2
        0x3
        0x1
    .end array-data

    :array_15
    .array-data 4
        0x2
        0x1
        0x3
        0x2
        0x1
        0x2
    .end array-data

    :array_16
    .array-data 4
        0x2
        0x2
        0x3
        0x1
        0x1
        0x2
    .end array-data

    :array_17
    .array-data 4
        0x3
        0x1
        0x2
        0x1
        0x3
        0x1
    .end array-data

    :array_18
    .array-data 4
        0x3
        0x1
        0x1
        0x2
        0x2
        0x2
    .end array-data

    :array_19
    .array-data 4
        0x3
        0x2
        0x1
        0x1
        0x2
        0x2
    .end array-data

    :array_1a
    .array-data 4
        0x3
        0x2
        0x1
        0x2
        0x2
        0x1
    .end array-data

    :array_1b
    .array-data 4
        0x3
        0x1
        0x2
        0x2
        0x1
        0x2
    .end array-data

    :array_1c
    .array-data 4
        0x3
        0x2
        0x2
        0x1
        0x1
        0x2
    .end array-data

    :array_1d
    .array-data 4
        0x3
        0x2
        0x2
        0x2
        0x1
        0x1
    .end array-data

    :array_1e
    .array-data 4
        0x2
        0x1
        0x2
        0x1
        0x2
        0x3
    .end array-data

    :array_1f
    .array-data 4
        0x2
        0x1
        0x2
        0x3
        0x2
        0x1
    .end array-data

    :array_20
    .array-data 4
        0x2
        0x3
        0x2
        0x1
        0x2
        0x1
    .end array-data

    :array_21
    .array-data 4
        0x1
        0x1
        0x1
        0x3
        0x2
        0x3
    .end array-data

    :array_22
    .array-data 4
        0x1
        0x3
        0x1
        0x1
        0x2
        0x3
    .end array-data

    :array_23
    .array-data 4
        0x1
        0x3
        0x1
        0x3
        0x2
        0x1
    .end array-data

    :array_24
    .array-data 4
        0x1
        0x1
        0x2
        0x3
        0x1
        0x3
    .end array-data

    :array_25
    .array-data 4
        0x1
        0x3
        0x2
        0x1
        0x1
        0x3
    .end array-data

    :array_26
    .array-data 4
        0x1
        0x3
        0x2
        0x3
        0x1
        0x1
    .end array-data

    :array_27
    .array-data 4
        0x2
        0x1
        0x1
        0x3
        0x1
        0x3
    .end array-data

    :array_28
    .array-data 4
        0x2
        0x3
        0x1
        0x1
        0x1
        0x3
    .end array-data

    :array_29
    .array-data 4
        0x2
        0x3
        0x1
        0x3
        0x1
        0x1
    .end array-data

    :array_2a
    .array-data 4
        0x1
        0x1
        0x2
        0x1
        0x3
        0x3
    .end array-data

    :array_2b
    .array-data 4
        0x1
        0x1
        0x2
        0x3
        0x3
        0x1
    .end array-data

    :array_2c
    .array-data 4
        0x1
        0x3
        0x2
        0x1
        0x3
        0x1
    .end array-data

    :array_2d
    .array-data 4
        0x1
        0x1
        0x3
        0x1
        0x2
        0x3
    .end array-data

    :array_2e
    .array-data 4
        0x1
        0x1
        0x3
        0x3
        0x2
        0x1
    .end array-data

    :array_2f
    .array-data 4
        0x1
        0x3
        0x3
        0x1
        0x2
        0x1
    .end array-data

    :array_30
    .array-data 4
        0x3
        0x1
        0x3
        0x1
        0x2
        0x1
    .end array-data

    :array_31
    .array-data 4
        0x2
        0x1
        0x1
        0x3
        0x3
        0x1
    .end array-data

    :array_32
    .array-data 4
        0x2
        0x3
        0x1
        0x1
        0x3
        0x1
    .end array-data

    :array_33
    .array-data 4
        0x2
        0x1
        0x3
        0x1
        0x1
        0x3
    .end array-data

    :array_34
    .array-data 4
        0x2
        0x1
        0x3
        0x3
        0x1
        0x1
    .end array-data

    :array_35
    .array-data 4
        0x2
        0x1
        0x3
        0x1
        0x3
        0x1
    .end array-data

    :array_36
    .array-data 4
        0x3
        0x1
        0x1
        0x1
        0x2
        0x3
    .end array-data

    :array_37
    .array-data 4
        0x3
        0x1
        0x1
        0x3
        0x2
        0x1
    .end array-data

    :array_38
    .array-data 4
        0x3
        0x3
        0x1
        0x1
        0x2
        0x1
    .end array-data

    :array_39
    .array-data 4
        0x3
        0x1
        0x2
        0x1
        0x1
        0x3
    .end array-data

    :array_3a
    .array-data 4
        0x3
        0x1
        0x2
        0x3
        0x1
        0x1
    .end array-data

    :array_3b
    .array-data 4
        0x3
        0x3
        0x2
        0x1
        0x1
        0x1
    .end array-data

    :array_3c
    .array-data 4
        0x3
        0x1
        0x4
        0x1
        0x1
        0x1
    .end array-data

    :array_3d
    .array-data 4
        0x2
        0x2
        0x1
        0x4
        0x1
        0x1
    .end array-data

    :array_3e
    .array-data 4
        0x4
        0x3
        0x1
        0x1
        0x1
        0x1
    .end array-data

    :array_3f
    .array-data 4
        0x1
        0x1
        0x1
        0x2
        0x2
        0x4
    .end array-data

    :array_40
    .array-data 4
        0x1
        0x1
        0x1
        0x4
        0x2
        0x2
    .end array-data

    :array_41
    .array-data 4
        0x1
        0x2
        0x1
        0x1
        0x2
        0x4
    .end array-data

    :array_42
    .array-data 4
        0x1
        0x2
        0x1
        0x4
        0x2
        0x1
    .end array-data

    :array_43
    .array-data 4
        0x1
        0x4
        0x1
        0x1
        0x2
        0x2
    .end array-data

    :array_44
    .array-data 4
        0x1
        0x4
        0x1
        0x2
        0x2
        0x1
    .end array-data

    :array_45
    .array-data 4
        0x1
        0x1
        0x2
        0x2
        0x1
        0x4
    .end array-data

    :array_46
    .array-data 4
        0x1
        0x1
        0x2
        0x4
        0x1
        0x2
    .end array-data

    :array_47
    .array-data 4
        0x1
        0x2
        0x2
        0x1
        0x1
        0x4
    .end array-data

    :array_48
    .array-data 4
        0x1
        0x2
        0x2
        0x4
        0x1
        0x1
    .end array-data

    :array_49
    .array-data 4
        0x1
        0x4
        0x2
        0x1
        0x1
        0x2
    .end array-data

    :array_4a
    .array-data 4
        0x1
        0x4
        0x2
        0x2
        0x1
        0x1
    .end array-data

    :array_4b
    .array-data 4
        0x2
        0x4
        0x1
        0x2
        0x1
        0x1
    .end array-data

    :array_4c
    .array-data 4
        0x2
        0x2
        0x1
        0x1
        0x1
        0x4
    .end array-data

    :array_4d
    .array-data 4
        0x4
        0x1
        0x3
        0x1
        0x1
        0x1
    .end array-data

    :array_4e
    .array-data 4
        0x2
        0x4
        0x1
        0x1
        0x1
        0x2
    .end array-data

    :array_4f
    .array-data 4
        0x1
        0x3
        0x4
        0x1
        0x1
        0x1
    .end array-data

    :array_50
    .array-data 4
        0x1
        0x1
        0x1
        0x2
        0x4
        0x2
    .end array-data

    :array_51
    .array-data 4
        0x1
        0x2
        0x1
        0x1
        0x4
        0x2
    .end array-data

    :array_52
    .array-data 4
        0x1
        0x2
        0x1
        0x2
        0x4
        0x1
    .end array-data

    :array_53
    .array-data 4
        0x1
        0x1
        0x4
        0x2
        0x1
        0x2
    .end array-data

    :array_54
    .array-data 4
        0x1
        0x2
        0x4
        0x1
        0x1
        0x2
    .end array-data

    :array_55
    .array-data 4
        0x1
        0x2
        0x4
        0x2
        0x1
        0x1
    .end array-data

    :array_56
    .array-data 4
        0x4
        0x1
        0x1
        0x2
        0x1
        0x2
    .end array-data

    :array_57
    .array-data 4
        0x4
        0x2
        0x1
        0x1
        0x1
        0x2
    .end array-data

    :array_58
    .array-data 4
        0x4
        0x2
        0x1
        0x2
        0x1
        0x1
    .end array-data

    :array_59
    .array-data 4
        0x2
        0x1
        0x2
        0x1
        0x4
        0x1
    .end array-data

    :array_5a
    .array-data 4
        0x2
        0x1
        0x4
        0x1
        0x2
        0x1
    .end array-data

    :array_5b
    .array-data 4
        0x4
        0x1
        0x2
        0x1
        0x2
        0x1
    .end array-data

    :array_5c
    .array-data 4
        0x1
        0x1
        0x1
        0x1
        0x4
        0x3
    .end array-data

    :array_5d
    .array-data 4
        0x1
        0x1
        0x1
        0x3
        0x4
        0x1
    .end array-data

    :array_5e
    .array-data 4
        0x1
        0x3
        0x1
        0x1
        0x4
        0x1
    .end array-data

    :array_5f
    .array-data 4
        0x1
        0x1
        0x4
        0x1
        0x1
        0x3
    .end array-data

    :array_60
    .array-data 4
        0x1
        0x1
        0x4
        0x3
        0x1
        0x1
    .end array-data

    :array_61
    .array-data 4
        0x4
        0x1
        0x1
        0x1
        0x1
        0x3
    .end array-data

    :array_62
    .array-data 4
        0x4
        0x1
        0x1
        0x3
        0x1
        0x1
    .end array-data

    :array_63
    .array-data 4
        0x1
        0x1
        0x3
        0x1
        0x4
        0x1
    .end array-data

    :array_64
    .array-data 4
        0x1
        0x1
        0x4
        0x1
        0x3
        0x1
    .end array-data

    :array_65
    .array-data 4
        0x3
        0x1
        0x1
        0x1
        0x4
        0x1
    .end array-data

    :array_66
    .array-data 4
        0x4
        0x1
        0x1
        0x1
        0x3
        0x1
    .end array-data

    :array_67
    .array-data 4
        0x2
        0x1
        0x1
        0x4
        0x1
        0x2
    .end array-data

    :array_68
    .array-data 4
        0x2
        0x1
        0x1
        0x2
        0x1
        0x4
    .end array-data

    :array_69
    .array-data 4
        0x2
        0x1
        0x1
        0x2
        0x3
        0x2
    .end array-data

    :array_6a
    .array-data 4
        0x2
        0x3
        0x3
        0x1
        0x1
        0x1
        0x2
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/zxing/oned/OneDReader;-><init>()V

    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method private static decodeCode(Lcom/google/zxing/common/BitArray;[II)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p2, p1}, Lcom/google/zxing/oned/OneDReader;->recordPattern(Lcom/google/zxing/common/BitArray;I[I)V

    .line 4
    .line 5
    const/high16 p0, 0x3e800000    # 0.25f

    .line 6
    const/4 p2, -0x1

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    :goto_0
    sget-object v1, Lcom/google/zxing/oned/Code128Reader;->CODE_PATTERNS:[[I

    .line 10
    array-length v2, v1

    .line 11
    .line 12
    if-ge v0, v2, :cond_1

    .line 13
    .line 14
    aget-object v1, v1, v0

    .line 15
    .line 16
    .line 17
    const v2, 0x3f333333    # 0.7f

    .line 18
    .line 19
    .line 20
    invoke-static {p1, v1, v2}, Lcom/google/zxing/oned/OneDReader;->patternMatchVariance([I[IF)F

    .line 21
    move-result v1

    .line 22
    .line 23
    cmpg-float v2, v1, p0

    .line 24
    .line 25
    if-gez v2, :cond_0

    .line 26
    move p2, v0

    .line 27
    move p0, v1

    .line 28
    .line 29
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_1
    if-ltz p2, :cond_2

    .line 33
    return p2

    .line 34
    .line 35
    .line 36
    :cond_2
    invoke-static {}, Lcom/google/zxing/NotFoundException;->getNotFoundInstance()Lcom/google/zxing/NotFoundException;

    .line 37
    move-result-object p0

    .line 38
    throw p0
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
.end method

.method private static findStartPattern(Lcom/google/zxing/common/BitArray;)[I
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/zxing/common/BitArray;->getSize()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v1}, Lcom/google/zxing/common/BitArray;->getNextSet(I)I

    .line 9
    move-result v2

    .line 10
    const/4 v3, 0x6

    .line 11
    .line 12
    new-array v3, v3, [I

    .line 13
    move v5, v1

    .line 14
    move v6, v5

    .line 15
    move v4, v2

    .line 16
    .line 17
    :goto_0
    if-ge v2, v0, :cond_5

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v2}, Lcom/google/zxing/common/BitArray;->get(I)Z

    .line 21
    move-result v7

    .line 22
    const/4 v8, 0x1

    .line 23
    .line 24
    if-eq v7, v5, :cond_0

    .line 25
    .line 26
    aget v7, v3, v6

    .line 27
    add-int/2addr v7, v8

    .line 28
    .line 29
    aput v7, v3, v6

    .line 30
    goto :goto_3

    .line 31
    :cond_0
    const/4 v7, 0x5

    .line 32
    .line 33
    if-ne v6, v7, :cond_4

    .line 34
    const/4 v7, -0x1

    .line 35
    .line 36
    const/high16 v9, 0x3e800000    # 0.25f

    .line 37
    .line 38
    const/16 v10, 0x67

    .line 39
    .line 40
    :goto_1
    const/16 v11, 0x69

    .line 41
    .line 42
    if-gt v10, v11, :cond_2

    .line 43
    .line 44
    sget-object v11, Lcom/google/zxing/oned/Code128Reader;->CODE_PATTERNS:[[I

    .line 45
    .line 46
    aget-object v11, v11, v10

    .line 47
    .line 48
    .line 49
    const v12, 0x3f333333    # 0.7f

    .line 50
    .line 51
    .line 52
    invoke-static {v3, v11, v12}, Lcom/google/zxing/oned/OneDReader;->patternMatchVariance([I[IF)F

    .line 53
    move-result v11

    .line 54
    .line 55
    cmpg-float v12, v11, v9

    .line 56
    .line 57
    if-gez v12, :cond_1

    .line 58
    move v7, v10

    .line 59
    move v9, v11

    .line 60
    .line 61
    :cond_1
    add-int/lit8 v10, v10, 0x1

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    const/4 v9, 0x2

    .line 64
    .line 65
    if-ltz v7, :cond_3

    .line 66
    .line 67
    sub-int v10, v2, v4

    .line 68
    div-int/2addr v10, v9

    .line 69
    .line 70
    sub-int v10, v4, v10

    .line 71
    .line 72
    .line 73
    invoke-static {v1, v10}, Ljava/lang/Math;->max(II)I

    .line 74
    move-result v10

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v10, v4, v1}, Lcom/google/zxing/common/BitArray;->isRange(IIZ)Z

    .line 78
    move-result v10

    .line 79
    .line 80
    if-eqz v10, :cond_3

    .line 81
    .line 82
    .line 83
    filled-new-array {v4, v2, v7}, [I

    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    .line 87
    :cond_3
    aget v7, v3, v1

    .line 88
    .line 89
    aget v10, v3, v8

    .line 90
    add-int/2addr v7, v10

    .line 91
    add-int/2addr v4, v7

    .line 92
    .line 93
    add-int/lit8 v7, v6, -0x1

    .line 94
    .line 95
    .line 96
    invoke-static {v3, v9, v3, v1, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 97
    .line 98
    aput v1, v3, v7

    .line 99
    .line 100
    aput v1, v3, v6

    .line 101
    .line 102
    add-int/lit8 v6, v6, -0x1

    .line 103
    goto :goto_2

    .line 104
    .line 105
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 106
    .line 107
    :goto_2
    aput v8, v3, v6

    .line 108
    .line 109
    xor-int/lit8 v5, v5, 0x1

    .line 110
    .line 111
    :goto_3
    add-int/lit8 v2, v2, 0x1

    .line 112
    goto :goto_0

    .line 113
    .line 114
    .line 115
    :cond_5
    invoke-static {}, Lcom/google/zxing/NotFoundException;->getNotFoundInstance()Lcom/google/zxing/NotFoundException;

    .line 116
    move-result-object p0

    .line 117
    throw p0
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
.end method


# virtual methods
.method public decodeRow(ILcom/google/zxing/common/BitArray;Ljava/util/Map;)Lcom/google/zxing/Result;
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/google/zxing/common/BitArray;",
            "Ljava/util/Map<",
            "Lcom/google/zxing/DecodeHintType;",
            "*>;)",
            "Lcom/google/zxing/Result;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/NotFoundException;,
            Lcom/google/zxing/FormatException;,
            Lcom/google/zxing/ChecksumException;
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p2

    .line 3
    .line 4
    move-object/from16 v1, p3

    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    sget-object v4, Lcom/google/zxing/DecodeHintType;->ASSUME_GS1:Lcom/google/zxing/DecodeHintType;

    .line 11
    .line 12
    .line 13
    invoke-interface {v1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    move v1, v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v1, v3

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-static {v0}, Lcom/google/zxing/oned/Code128Reader;->findStartPattern(Lcom/google/zxing/common/BitArray;)[I

    .line 23
    move-result-object v4

    .line 24
    const/4 v5, 0x2

    .line 25
    .line 26
    aget v6, v4, v5

    .line 27
    .line 28
    new-instance v7, Ljava/util/ArrayList;

    .line 29
    .line 30
    const/16 v8, 0x14

    .line 31
    .line 32
    .line 33
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 34
    int-to-byte v9, v6

    .line 35
    .line 36
    .line 37
    invoke-static {v9}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 38
    move-result-object v9

    .line 39
    .line 40
    .line 41
    invoke-interface {v7, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    packed-switch v6, :pswitch_data_0

    .line 45
    .line 46
    .line 47
    invoke-static {}, Lcom/google/zxing/FormatException;->getFormatInstance()Lcom/google/zxing/FormatException;

    .line 48
    move-result-object v0

    .line 49
    throw v0

    .line 50
    .line 51
    :pswitch_0
    const/16 v12, 0x63

    .line 52
    goto :goto_1

    .line 53
    .line 54
    :pswitch_1
    const/16 v12, 0x64

    .line 55
    goto :goto_1

    .line 56
    .line 57
    :pswitch_2
    const/16 v12, 0x65

    .line 58
    .line 59
    :goto_1
    new-instance v13, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-direct {v13, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 63
    .line 64
    aget v8, v4, v3

    .line 65
    .line 66
    aget v14, v4, v2

    .line 67
    const/4 v15, 0x6

    .line 68
    .line 69
    move/from16 v16, v2

    .line 70
    .line 71
    new-array v2, v15, [I

    .line 72
    .line 73
    move/from16 p3, v12

    .line 74
    move v12, v8

    .line 75
    move v8, v14

    .line 76
    .line 77
    move/from16 v14, p3

    .line 78
    move v9, v3

    .line 79
    .line 80
    move/from16 v17, v9

    .line 81
    .line 82
    move/from16 v18, v17

    .line 83
    .line 84
    move/from16 v19, v18

    .line 85
    .line 86
    move/from16 v20, v19

    .line 87
    .line 88
    move/from16 p3, v5

    .line 89
    .line 90
    move/from16 v21, v16

    .line 91
    .line 92
    move/from16 v5, v20

    .line 93
    .line 94
    :goto_2
    if-nez v17, :cond_1b

    .line 95
    .line 96
    .line 97
    invoke-static {v0, v2, v8}, Lcom/google/zxing/oned/Code128Reader;->decodeCode(Lcom/google/zxing/common/BitArray;[II)I

    .line 98
    move-result v5

    .line 99
    int-to-byte v12, v5

    .line 100
    .line 101
    .line 102
    invoke-static {v12}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 103
    move-result-object v12

    .line 104
    .line 105
    .line 106
    invoke-interface {v7, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    const/16 v12, 0x6a

    .line 109
    .line 110
    if-eq v5, v12, :cond_1

    .line 111
    .line 112
    move/from16 v21, v16

    .line 113
    .line 114
    :cond_1
    if-eq v5, v12, :cond_2

    .line 115
    .line 116
    add-int/lit8 v20, v20, 0x1

    .line 117
    .line 118
    mul-int v23, v20, v5

    .line 119
    .line 120
    add-int v6, v6, v23

    .line 121
    .line 122
    :cond_2
    move/from16 v24, v8

    .line 123
    const/4 v10, 0x0

    .line 124
    .line 125
    :goto_3
    if-ge v10, v15, :cond_3

    .line 126
    .line 127
    aget v25, v2, v10

    .line 128
    .line 129
    add-int v24, v24, v25

    .line 130
    .line 131
    add-int/lit8 v10, v10, 0x1

    .line 132
    goto :goto_3

    .line 133
    .line 134
    .line 135
    :cond_3
    packed-switch v5, :pswitch_data_1

    .line 136
    .line 137
    const/16 v10, 0x60

    .line 138
    .line 139
    const-string v11, "]C1"

    .line 140
    .line 141
    .line 142
    packed-switch v14, :pswitch_data_2

    .line 143
    goto :goto_5

    .line 144
    .line 145
    :pswitch_3
    const/16 v15, 0x40

    .line 146
    .line 147
    if-ge v5, v15, :cond_7

    .line 148
    .line 149
    if-ne v9, v3, :cond_4

    .line 150
    .line 151
    add-int/lit8 v9, v5, 0x20

    .line 152
    int-to-char v9, v9

    .line 153
    .line 154
    .line 155
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 156
    goto :goto_4

    .line 157
    .line 158
    :cond_4
    add-int/lit16 v9, v5, 0xa0

    .line 159
    int-to-char v9, v9

    .line 160
    .line 161
    .line 162
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 163
    :goto_4
    const/4 v9, 0x0

    .line 164
    .line 165
    :cond_5
    :goto_5
    :pswitch_4
    const/16 v10, 0x64

    .line 166
    :cond_6
    :goto_6
    const/4 v11, 0x0

    .line 167
    .line 168
    goto/16 :goto_b

    .line 169
    .line 170
    :cond_7
    if-ge v5, v10, :cond_9

    .line 171
    .line 172
    if-ne v9, v3, :cond_8

    .line 173
    .line 174
    add-int/lit8 v9, v5, -0x40

    .line 175
    int-to-char v9, v9

    .line 176
    .line 177
    .line 178
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 179
    goto :goto_4

    .line 180
    .line 181
    :cond_8
    add-int/lit8 v9, v5, 0x40

    .line 182
    int-to-char v9, v9

    .line 183
    .line 184
    .line 185
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 186
    goto :goto_4

    .line 187
    .line 188
    :cond_9
    if-eq v5, v12, :cond_a

    .line 189
    .line 190
    const/16 v21, 0x0

    .line 191
    .line 192
    :cond_a
    if-eq v5, v12, :cond_e

    .line 193
    .line 194
    .line 195
    packed-switch v5, :pswitch_data_3

    .line 196
    goto :goto_5

    .line 197
    .line 198
    :pswitch_5
    if-eqz v1, :cond_5

    .line 199
    .line 200
    .line 201
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    .line 202
    move-result v10

    .line 203
    .line 204
    if-nez v10, :cond_b

    .line 205
    .line 206
    .line 207
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    goto :goto_5

    .line 209
    .line 210
    :cond_b
    const/16 v10, 0x1d

    .line 211
    .line 212
    .line 213
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 214
    goto :goto_5

    .line 215
    .line 216
    :pswitch_6
    if-nez v3, :cond_c

    .line 217
    .line 218
    if-eqz v9, :cond_c

    .line 219
    .line 220
    :goto_7
    move/from16 v3, v16

    .line 221
    goto :goto_4

    .line 222
    .line 223
    :cond_c
    if-eqz v3, :cond_d

    .line 224
    .line 225
    if-eqz v9, :cond_d

    .line 226
    :goto_8
    const/4 v3, 0x0

    .line 227
    goto :goto_4

    .line 228
    .line 229
    :cond_d
    move/from16 v9, v16

    .line 230
    goto :goto_5

    .line 231
    .line 232
    :pswitch_7
    const/16 v10, 0x64

    .line 233
    const/4 v11, 0x0

    .line 234
    .line 235
    :goto_9
    const/16 v14, 0x64

    .line 236
    .line 237
    goto/16 :goto_b

    .line 238
    .line 239
    :pswitch_8
    const/16 v10, 0x64

    .line 240
    const/4 v11, 0x0

    .line 241
    .line 242
    const/16 v14, 0x63

    .line 243
    .line 244
    goto/16 :goto_b

    .line 245
    .line 246
    :pswitch_9
    move/from16 v11, v16

    .line 247
    .line 248
    const/16 v10, 0x64

    .line 249
    goto :goto_9

    .line 250
    .line 251
    :cond_e
    move/from16 v17, v16

    .line 252
    goto :goto_5

    .line 253
    .line 254
    :pswitch_a
    if-ge v5, v10, :cond_10

    .line 255
    .line 256
    if-ne v9, v3, :cond_f

    .line 257
    .line 258
    add-int/lit8 v9, v5, 0x20

    .line 259
    int-to-char v9, v9

    .line 260
    .line 261
    .line 262
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 263
    goto :goto_4

    .line 264
    .line 265
    :cond_f
    add-int/lit16 v9, v5, 0xa0

    .line 266
    int-to-char v9, v9

    .line 267
    .line 268
    .line 269
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 270
    goto :goto_4

    .line 271
    .line 272
    :cond_10
    if-eq v5, v12, :cond_11

    .line 273
    .line 274
    const/16 v21, 0x0

    .line 275
    .line 276
    :cond_11
    if-eq v5, v12, :cond_e

    .line 277
    .line 278
    .line 279
    packed-switch v5, :pswitch_data_4

    .line 280
    goto :goto_5

    .line 281
    .line 282
    :pswitch_b
    if-eqz v1, :cond_5

    .line 283
    .line 284
    .line 285
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    .line 286
    move-result v10

    .line 287
    .line 288
    if-nez v10, :cond_12

    .line 289
    .line 290
    .line 291
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    goto/16 :goto_5

    .line 294
    .line 295
    :cond_12
    const/16 v10, 0x1d

    .line 296
    .line 297
    .line 298
    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    goto/16 :goto_5

    .line 301
    .line 302
    :pswitch_c
    const/16 v10, 0x64

    .line 303
    :pswitch_d
    const/4 v11, 0x0

    .line 304
    .line 305
    :goto_a
    const/16 v14, 0x65

    .line 306
    goto :goto_b

    .line 307
    .line 308
    :pswitch_e
    if-nez v3, :cond_13

    .line 309
    .line 310
    if-eqz v9, :cond_13

    .line 311
    goto :goto_7

    .line 312
    .line 313
    :cond_13
    if-eqz v3, :cond_d

    .line 314
    .line 315
    if-eqz v9, :cond_d

    .line 316
    goto :goto_8

    .line 317
    .line 318
    :pswitch_f
    move/from16 v11, v16

    .line 319
    .line 320
    const/16 v10, 0x64

    .line 321
    goto :goto_a

    .line 322
    .line 323
    :pswitch_10
    const/16 v10, 0x64

    .line 324
    .line 325
    if-ge v5, v10, :cond_15

    .line 326
    .line 327
    const/16 v11, 0xa

    .line 328
    .line 329
    if-ge v5, v11, :cond_14

    .line 330
    .line 331
    const/16 v11, 0x30

    .line 332
    .line 333
    .line 334
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    :cond_14
    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    goto/16 :goto_6

    .line 340
    .line 341
    :cond_15
    if-eq v5, v12, :cond_16

    .line 342
    .line 343
    const/16 v21, 0x0

    .line 344
    .line 345
    :cond_16
    if-eq v5, v12, :cond_18

    .line 346
    .line 347
    .line 348
    packed-switch v5, :pswitch_data_5

    .line 349
    .line 350
    goto/16 :goto_6

    .line 351
    .line 352
    :pswitch_11
    if-eqz v1, :cond_6

    .line 353
    .line 354
    .line 355
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    .line 356
    move-result v12

    .line 357
    .line 358
    if-nez v12, :cond_17

    .line 359
    .line 360
    .line 361
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    goto/16 :goto_6

    .line 364
    .line 365
    :cond_17
    const/16 v11, 0x1d

    .line 366
    .line 367
    .line 368
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    goto/16 :goto_6

    .line 371
    :pswitch_12
    move v14, v10

    .line 372
    .line 373
    goto/16 :goto_6

    .line 374
    .line 375
    :cond_18
    move/from16 v17, v16

    .line 376
    .line 377
    goto/16 :goto_6

    .line 378
    .line 379
    :goto_b
    const/16 v12, 0x65

    .line 380
    .line 381
    if-eqz v18, :cond_1a

    .line 382
    .line 383
    if-ne v14, v12, :cond_19

    .line 384
    move v14, v10

    .line 385
    goto :goto_c

    .line 386
    :cond_19
    move v14, v12

    .line 387
    .line 388
    :cond_1a
    :goto_c
    move/from16 v12, v19

    .line 389
    .line 390
    move/from16 v19, v5

    .line 391
    move v5, v12

    .line 392
    move v12, v8

    .line 393
    .line 394
    move/from16 v18, v11

    .line 395
    .line 396
    move/from16 v8, v24

    .line 397
    const/4 v15, 0x6

    .line 398
    .line 399
    goto/16 :goto_2

    .line 400
    .line 401
    .line 402
    :pswitch_13
    invoke-static {}, Lcom/google/zxing/FormatException;->getFormatInstance()Lcom/google/zxing/FormatException;

    .line 403
    move-result-object v0

    .line 404
    throw v0

    .line 405
    .line 406
    :cond_1b
    sub-int v1, v8, v12

    .line 407
    .line 408
    .line 409
    invoke-virtual {v0, v8}, Lcom/google/zxing/common/BitArray;->getNextUnset(I)I

    .line 410
    move-result v2

    .line 411
    .line 412
    .line 413
    invoke-virtual {v0}, Lcom/google/zxing/common/BitArray;->getSize()I

    .line 414
    move-result v3

    .line 415
    .line 416
    sub-int v8, v2, v12

    .line 417
    .line 418
    div-int/lit8 v8, v8, 0x2

    .line 419
    add-int/2addr v8, v2

    .line 420
    .line 421
    .line 422
    invoke-static {v3, v8}, Ljava/lang/Math;->min(II)I

    .line 423
    move-result v3

    .line 424
    const/4 v8, 0x0

    .line 425
    .line 426
    .line 427
    invoke-virtual {v0, v2, v3, v8}, Lcom/google/zxing/common/BitArray;->isRange(IIZ)Z

    .line 428
    move-result v0

    .line 429
    .line 430
    if-eqz v0, :cond_21

    .line 431
    .line 432
    mul-int v20, v20, v5

    .line 433
    .line 434
    sub-int v6, v6, v20

    .line 435
    .line 436
    rem-int/lit8 v6, v6, 0x67

    .line 437
    .line 438
    if-ne v6, v5, :cond_20

    .line 439
    .line 440
    .line 441
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->length()I

    .line 442
    move-result v0

    .line 443
    .line 444
    if-eqz v0, :cond_1f

    .line 445
    .line 446
    if-lez v0, :cond_1d

    .line 447
    .line 448
    if-eqz v21, :cond_1d

    .line 449
    .line 450
    const/16 v2, 0x63

    .line 451
    .line 452
    if-ne v14, v2, :cond_1c

    .line 453
    .line 454
    add-int/lit8 v2, v0, -0x2

    .line 455
    .line 456
    .line 457
    invoke-virtual {v13, v2, v0}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 458
    goto :goto_d

    .line 459
    .line 460
    :cond_1c
    add-int/lit8 v2, v0, -0x1

    .line 461
    .line 462
    .line 463
    invoke-virtual {v13, v2, v0}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 464
    .line 465
    :cond_1d
    :goto_d
    aget v0, v4, v16

    .line 466
    .line 467
    const/16 v22, 0x0

    .line 468
    .line 469
    aget v2, v4, v22

    .line 470
    add-int/2addr v0, v2

    .line 471
    int-to-float v0, v0

    .line 472
    .line 473
    const/high16 v2, 0x40000000    # 2.0f

    .line 474
    div-float/2addr v0, v2

    .line 475
    int-to-float v3, v12

    .line 476
    int-to-float v1, v1

    .line 477
    div-float/2addr v1, v2

    .line 478
    add-float/2addr v3, v1

    .line 479
    .line 480
    .line 481
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 482
    move-result v1

    .line 483
    .line 484
    new-array v2, v1, [B

    .line 485
    .line 486
    move/from16 v4, v22

    .line 487
    .line 488
    :goto_e
    if-ge v4, v1, :cond_1e

    .line 489
    .line 490
    .line 491
    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 492
    move-result-object v5

    .line 493
    .line 494
    check-cast v5, Ljava/lang/Byte;

    .line 495
    .line 496
    .line 497
    invoke-virtual {v5}, Ljava/lang/Byte;->byteValue()B

    .line 498
    move-result v5

    .line 499
    .line 500
    aput-byte v5, v2, v4

    .line 501
    .line 502
    add-int/lit8 v4, v4, 0x1

    .line 503
    goto :goto_e

    .line 504
    .line 505
    :cond_1e
    new-instance v1, Lcom/google/zxing/Result;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 509
    move-result-object v4

    .line 510
    .line 511
    new-instance v5, Lcom/google/zxing/ResultPoint;

    .line 512
    .line 513
    move/from16 v6, p1

    .line 514
    int-to-float v6, v6

    .line 515
    .line 516
    .line 517
    invoke-direct {v5, v0, v6}, Lcom/google/zxing/ResultPoint;-><init>(FF)V

    .line 518
    .line 519
    new-instance v0, Lcom/google/zxing/ResultPoint;

    .line 520
    .line 521
    .line 522
    invoke-direct {v0, v3, v6}, Lcom/google/zxing/ResultPoint;-><init>(FF)V

    .line 523
    .line 524
    .line 525
    filled-new-array {v5, v0}, [Lcom/google/zxing/ResultPoint;

    .line 526
    move-result-object v0

    .line 527
    .line 528
    sget-object v3, Lcom/google/zxing/BarcodeFormat;->CODE_128:Lcom/google/zxing/BarcodeFormat;

    .line 529
    .line 530
    .line 531
    invoke-direct {v1, v4, v2, v0, v3}, Lcom/google/zxing/Result;-><init>(Ljava/lang/String;[B[Lcom/google/zxing/ResultPoint;Lcom/google/zxing/BarcodeFormat;)V

    .line 532
    return-object v1

    .line 533
    .line 534
    .line 535
    :cond_1f
    invoke-static {}, Lcom/google/zxing/NotFoundException;->getNotFoundInstance()Lcom/google/zxing/NotFoundException;

    .line 536
    move-result-object v0

    .line 537
    throw v0

    .line 538
    .line 539
    .line 540
    :cond_20
    invoke-static {}, Lcom/google/zxing/ChecksumException;->getChecksumInstance()Lcom/google/zxing/ChecksumException;

    .line 541
    move-result-object v0

    .line 542
    throw v0

    .line 543
    .line 544
    .line 545
    :cond_21
    invoke-static {}, Lcom/google/zxing/NotFoundException;->getNotFoundInstance()Lcom/google/zxing/NotFoundException;

    .line 546
    move-result-object v0

    .line 547
    throw v0

    .line 548
    nop

    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    :pswitch_data_0
    .packed-switch 0x67
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    :pswitch_data_1
    .packed-switch 0x67
        :pswitch_13
        :pswitch_13
        :pswitch_13
    .end packed-switch

    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    :pswitch_data_2
    .packed-switch 0x63
        :pswitch_10
        :pswitch_a
        :pswitch_3
    .end packed-switch

    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    :pswitch_data_3
    .packed-switch 0x60
        :pswitch_4
        :pswitch_4
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch

    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    :pswitch_data_4
    .packed-switch 0x60
        :pswitch_4
        :pswitch_4
        :pswitch_f
        :pswitch_8
        :pswitch_e
        :pswitch_c
        :pswitch_b
    .end packed-switch

    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    :pswitch_data_5
    .packed-switch 0x64
        :pswitch_12
        :pswitch_d
        :pswitch_11
    .end packed-switch
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
.end method
