TARGET=example

DEBUG=-DDEBUG
DEBUG=

CXX = g++

#
DIR_OBJ=objs
SOURCES=$(wildcard *.cc)
OBJECTS=$(patsubst %.cc,$(DIR_OBJ)/%.o,$(SOURCES))


INCLUDES = -I. -I./include
CPPFLAGS = -std=c++17 -O2 -Wno-deprecated 
LDFLAGS =-L/usr/local/lib 
LDLIBS  = -lm 
LDLIBS += -lpthread 

all: $(TARGET)
	@echo Made [ $? ] OK :\)

run:
	@./$(TARGET)

clean:
	@$(RM) core *~ \#*\# *.bak *.BAK *\%
	@$(RM) -f .dummy
	@$(RM) -rf $(DIR_OBJ)
	
$(TARGET): $(OBJECTS) 
	@echo Linking [$@]
	@echo [$^]
	@eval $(CXX) $(LDFLAGS) $^ $(LDLIBS)  -o $@ 
	
$(DIR_OBJ)/%.o: %.cc
	@echo Compiling [$@]
	@mkdir -p $(DIR_OBJ)
	@eval $(CXX) -c $(INCLUDES) $(CPPFLAGS)  $< -o $@
	









