SRC = Test.java

JC = javac
JVM = java

TARGET = $(SRC:.java= ) 
JFLAGS = -g
.SUFFIXES: .java .class

run: all
	@echo Running [ $(SRC:.java= ) ] 
	@echo --------------
	@$(JVM) $(SRC:.java= ) 

all: $(TARGET)
	@echo Made [ $? ] OK :\)

$(TARGET): $(SRC:.java=.class)

.java.class:
	$(JC) $(JFLAGS) $*.java


clean:
	@$(RM) *.class
	@$(RM) *~
	