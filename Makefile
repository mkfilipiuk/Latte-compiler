all : source

source :
	cd src && $(MAKE)
	llvm-as -o lib/runtime.bc lib/runtime.ll

clean :
	cd src && $(MAKE) clean
