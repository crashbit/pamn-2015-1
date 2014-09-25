archivo = open("CPdescarga.txt", "read")

for cp in archivo:
	print cp


FILE *fp;
char cp[10];
fp =fopen("CPdescarga", "read");
while(!feof(fp)){
	fgets(cp,10, fp);
	printf("%s", cp);
}
fclose();