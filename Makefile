all : source

source :
	cd src && $(MAKE)

clean :
	cd src && $(MAKE) clean
