DECKS := $(wildcard es[0-9][0-9]_*)

.PHONY: all verifica clean $(DECKS)
all: $(DECKS)
$(DECKS):
	./build.sh $@
verifica:
	@for d in $(DECKS); do echo "== $$d"; tests/verifica.sh $$d || exit 1; done
clean:
	rm -rf $(addsuffix /build,$(DECKS))
