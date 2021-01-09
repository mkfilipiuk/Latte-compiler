@dnl = internal constant [4 x i8] c"%d\0A\00"
@fnl = internal constant [6 x i8] c"%.1f\0A\00"
@d   = internal constant [3 x i8] c"%d\00"
@s   = internal constant [3 x i8] c"%s\00"
@sxyz   = internal constant [3 x i8] c"%s\00"
@error_message   = internal constant [14 x i8] c"runtime error\00"

declare i32 @printf(i8*, ...)
declare i32 @scanf(i8*, ...)
declare i32 @puts(i8*)
declare i8* @malloc(i32)
declare i32 @strlen(i8*)
declare i8* @strcat(i8*, i8*)
declare void @exit(i32)

define void @printInt_function(i32 %x) {
   %t0 = getelementptr [4 x i8], [4 x i8]* @dnl, i32 0, i32 0
   call i32 (i8*, ...) @printf(i8* %t0, i32 %x)
   ret void
}

define void @printString_function(i8* %s) {
    call i32 @puts(i8* %s)
        ret void
}

define i32 @readInt_function() {
    %res = alloca i32
    %t1 = getelementptr [3 x i8], [3 x i8]* @d, i32 0, i32 0
        call i32 (i8*, ...) @scanf(i8* %t1, i32* %res)
        %t2 = load i32, i32* %res
        ret i32 %t2
}

define i8* @readString_function() {
    %res = alloca i8, i8 128
    %t1 = getelementptr [3 x i8],[3 x i8]* @s, i32 0, i32 0
    call i32 (i8*, ...) @scanf(i8* %t1, i8* %res)
    ret i8* %res
}

define void @error_function() {
    %error = getelementptr [14 x i8],[14 x i8]* @error_message, i32 0, i32 0
    call i32 @puts(i8* %error)
    call void @exit(i32 1)
    unreachable
}