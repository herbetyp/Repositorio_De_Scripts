import json
from pprint import pprint

with open('entrada.json') as f:
    dados =  json.load(f)

grupos = {}
for i in range(len(dados)):
    if dados[i]['user'] in grupos:
        grupos[dados[i]['user']].append(dados[i])
    else:
        grupos[dados[i]['user']] = [dados[i]]



# U0MFNAG05 106
# U1ZQR43RB 104
# U0KK0T3CG 2
# USLACKBOT 2

for user in grupos.keys():
    dicionario = {}
    curTs = ""

    for item in grupos[user]:
        if len(dicionario) == 0:
            curTs = item["ts"]
            dicionario[curTs] = [item]
        elif float(item["ts"]) - float(curTs) < 120:
            dicionario[curTs].append(item)
        else:
            curTs = item["ts"]
            dicionario[curTs] = [item]
            
    f = open("%s.json" % user, 'w')
    json.dump(dicionario, f)

